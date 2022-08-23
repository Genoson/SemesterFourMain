import * as express from "express";
import * as mongodb from "mongodb";
import { collections } from "./database";

export const employeeRouter = express.Router();
employeeRouter.use(express.json());

employeeRouter.get("/", async (_req, res) => {
    try{
        const employees = await collections.employees.find({}).toArray();
        res.status(200).send(employees);
    } catch (error) {
        res.status(500).send(error.message);
    }
});

employeeRouter.get("/:id", async (req, res) => {
    try{
        // ? signifies that the property is optional, will be undefined if not provided
        const id = req?.params?.id;
        const query = { _id: new mongodb.ObjectId(id) };
        const employee = await collections.employees.findOne(query);

        if (employee) {
            res.status(200).send(employee);
        } else {
            res.status(404).send(`Employee with id ${id} not found`);
        }
    } catch (error) {
        res.status(404).send(`Failed to find an employee: ID ${req?.params?.id}`);
    }
});

employeeRouter.post("/", async (req, res) => {
    try {
        const employee = req.body;
        const result = await collections.employees.insertOne(employee);

        if (result.acknowledged) {
            res.status(201).send(`Created employee with id ${result.insertedId}`);
        } else {
            res.status(500).send("Failed to create employee");
        }
    } catch (error) {
        console.error(error);
        res.status(400).send(error.message);
    }
});

employeeRouter.put("/:id", async (req, res) => {
    try {
        const id = req?.params?.id;
        const employee = req.body;
        const query = { _id: new mongodb.ObjectId(id) };
        const result = await collections.employees.updateOne(query, { $set: employee });

        if (result && result.matchedCount) {
            res.status(200).send(`Updated employee with id ${id}`);
        } else if (!result.matchedCount) {
            res.status(404).send(`Employee with id ${id} not found`);
        } else {
            res.status(304).send(`Employee with id ${id} not updated`);
        }
    } catch (error) {
        console.error(error.message);
        res.status(400).send(error.message);
    }
});

employeeRouter.delete("/:id", async (req, res) => {
    try {
        const id = req?.params?.id;
        const query = { _id: new mongodb.ObjectId(id) };
        const result = await collections.employees.deleteOne(query);

        if (result && result.deletedCount) {
            res.status(202).send(`Deleted employee with id ${id}`);
        } else if (!result) {
            res.status(400).send(`Employee with id ${id} not removed`);
        } else if (!result.deletedCount) {
            res.status(404).send(`Employee with id ${id} not found`);
        }
    } catch (error) {
        console.error(error.message);
        res.status(400).send(error.message);
    }
});


