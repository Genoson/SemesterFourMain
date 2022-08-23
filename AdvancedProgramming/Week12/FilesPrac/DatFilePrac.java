
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class DatFilePrac {

    private String fileName1;

    private double fileContents;


    public DatFilePrac(String fileName1, double fileContents) {
        this.fileName1 = fileName1;

        this.fileContents = fileContents;

    }

    public String getFileName1() {
        return fileName1;
    }

    public void setFileName1(String fileName1) {
        this.fileName1 = fileName1;
    }



    public double getFileContents() {
        return fileContents;
    }

    public void setFileContents(double fileContents) {
        this.fileContents = fileContents;
    }


    public void writeFile() {
        // check if file exists
        // if not, create file .dat
        if (!checkFileExists()) {
            createFile();
        }
        // write the filecontents to the file as a double
        try {
            FileWriter fw = new FileWriter(fileName1);
            fw.write(Double.toString(fileContents));
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkFileExists() {
        return new java.io.File(fileName1).exists();
    }

    public void createFile() {
        try {
            FileWriter fw = new FileWriter(fileName1);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        // read a .dat file, contents is a double
        try {
            FileReader fr = new FileReader(fileName1);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            
            while (line != null) {
                double contents = Double.parseDouble(line);
                System.out.println(contents +5);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}