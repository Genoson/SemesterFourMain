package Problem1_Inheritance;

public class Person {

    protected String myName;
    protected int myAge;
    protected String myGender; // no longer as binary (M/F) as this code implies(String a good choice over char)

    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    public String toString() {
        return this.myName + ", age: " + this.myAge + ", gender: " + this.myGender;
    }

    // Task 1
    public String getName() {
        return this.myName;
    }

    public void setName( String name) {
        this.myName = name;
    }

    public int getAge() {
        return this.myAge;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public String getGender() {
        return this.myGender;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }


}
    
