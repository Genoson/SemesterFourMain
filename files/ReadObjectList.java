import java.util.ArrayList;

public class ReadObjectList {

    public static void main(String[] args) {
        ObjectIO objectIO = new ObjectIO();
        ArrayList<Object> writeMeList = objectIO.readObjectListFromFile();
        System.out.println(writeMeList.get(0));
    }
    
}
