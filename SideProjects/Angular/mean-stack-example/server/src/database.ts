import * as mongodb from "mongodb";
import { Employee } from "./employee";

export const collections: {
  employees?: mongodb.Collection<Employee>;
} = {};

export async function connectToDatabase(uri: string) {
  const client = new mongodb.MongoClient(uri);
  await client.connect();

  const db = client.db("meanStackExample");
  await applySchemaValidation(db);

  const employeesCollection = db.collection<Employee>("employees");
  collections.employees = employeesCollection;
}

async function applySchemaValidation(db: mongodb.Db) {
  const jsonSchema = {
    $jsonSchema: {
      bsonType: "object",
      required: ["name", "position", "level"],
      additionalProperties: false,
      properties: {
        _id: {},
        name: {
          bsonType: "string",
          description: "must be a string and is required",
        },
        position: {
          bsonType: "string",
          description: "must be a string and is required",
          minLength: 5,
        },
        level: {
          bsonType: "string",
          description: "must be one of Junior, Mid or Senior and is required",
          enum: ["Junior", "Mid", "Senior"],
        },
      },
    },
  };

  await db
    .command({
      collMod: "employees",
      validator: jsonSchema,
    })
    .catch(async (error: mongodb.MongoServerError) => {
      if (error.codename === "NamespaceNotFound") {
        await db.createCollection("employees", { validator: jsonSchema });
      }
    });
}
