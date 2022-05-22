public class Instructor {
    
    private String lastName, firstName, officeNumber;

    public Instructor(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    public Instructor(Instructor instructorToCopy) {
        this.lastName = instructorToCopy.lastName;
        this.firstName = instructorToCopy.firstName;
        this.officeNumber = instructorToCopy.officeNumber;
    }

    public void set(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    public String toString() {
        return "Last Name: " + lastName + "\nFirst Name: " + firstName + "\nOffice Number: " + officeNumber;
    }
}
