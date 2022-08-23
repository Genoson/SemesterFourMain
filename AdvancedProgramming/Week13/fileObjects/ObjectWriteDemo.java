
import java.io.*;

public class ObjectWriteDemo {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        Employee employee = new Employee(1, person);
        System.out.println(employee);
        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


