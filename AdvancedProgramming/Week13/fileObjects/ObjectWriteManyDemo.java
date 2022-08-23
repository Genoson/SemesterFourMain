
import java.io.*;

public class ObjectWriteManyDemo {

    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", 30);
        Employee employee1 = new Employee(1, person1);
        Person person2 = new Person("Jane", "Doe", 31);
        Employee employee2 = new Employee(2, person2);
        Person person3 = new Person("John", "Smith", 32);
        Employee employee3 = new Employee(3, person3);

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee1);
            oos.writeObject(employee2);
            oos.writeObject(employee3);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
