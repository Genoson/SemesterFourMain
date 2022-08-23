import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private Person employee;
    

    public Employee(int id, Person employee) {
        this.id = id;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee=" + employee +
                '}';
    }

}