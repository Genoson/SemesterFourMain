
import java.io.*;
import java.util.ArrayList;

public class ObjectReadManyDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();

        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Employee employee = (Employee) ois.readObject();
                employees.add(employee);
            }
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }
        employees.forEach((employee) -> System.out.println(employee));

    }
}
