
public class FileDemo {
    public static void main(String[] args) {
        TextFilePrac tfp = new TextFilePrac("test.txt", "This is a test file.");
        tfp.writeFile();
        tfp.readFile();

        DatFilePrac dfp = new DatFilePrac("test.dat", 15.0);
        dfp.writeFile();
        dfp.readFile();
    }
}