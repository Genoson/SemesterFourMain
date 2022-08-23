
import java.io.Serializable;


// a simple java class that implement serializable interface and write to a file/ read from a file

public class WriteMe implements Serializable {

    private String name;
    private int age;
    private String message;

    public WriteMe(String name, int age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new StringBuffer(" Name: ").append(this.name).append(" Age: ").append(this.age).append(" Message: ").append(this.message).toString();
    }

}