public class ReadObject {

    public static void main(String[] args) {
        ObjectIO objectIO = new ObjectIO();
        WriteMe writeMe = (WriteMe) objectIO.readObjectFromFile();
        System.out.println(writeMe);
        writeMe.setAge(55);
        System.out.println(writeMe);
    }

}
