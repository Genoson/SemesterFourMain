
import java.io.*;

public class ObjectReadDemo {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
