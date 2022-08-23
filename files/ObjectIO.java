
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectIO {

    private static final String FILE_NAME = "./Objects/object.ser";
    private static final String FILE_NAME_LIST = "./Objects/objectList.ser";

    public static void main(String[] args) {

        WriteMe writeMe = new WriteMe("John", 30, "Hello World");
        WriteMe writeMe2 = new WriteMe("Jane", 25, "Hello World");
        WriteMe writeMe3 = new WriteMe("Jack", 20, "Hello World");

        ObjectIO objectIO = new ObjectIO();
        objectIO.writeObjectToFile(writeMe);

        ArrayList<Object> writeMeList = new ArrayList<Object>();
        writeMeList.add(writeMe);
        writeMeList.add(writeMe2);
        writeMeList.add(writeMe3);
        objectIO.writeObjectListToFile(writeMeList);
        

    }

    public void writeObjectToFile(Object serializableObject) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializableObject);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object readObjectFromFile() {
        Object object = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Object read from file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    // not a useful method
    // public void appendObjectToFile(Object serializableObject) {

    //     try {
    //         FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME, true);
    //         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    //         objectOutputStream.writeObject(serializableObject);
    //         objectOutputStream.close();
    //         fileOutputStream.close();
    //         System.out.println("Object appended to file");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    public void writeObjectListToFile(ArrayList<Object> serializableObjectList) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME_LIST);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializableObjectList);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object list written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Object> readObjectListFromFile() {
        ArrayList<Object> objectList = new ArrayList<Object>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME_LIST);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    break;
                }
                objectList.add(object);
            }
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Object list read from file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objectList;

    }

}
