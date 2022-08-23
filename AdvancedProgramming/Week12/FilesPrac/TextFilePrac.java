
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class TextFilePrac {

    private String fileName;
    private String fileContents;

    public TextFilePrac(String fileName, String fileContents) {
        this.fileName = fileName;
        this.fileContents = fileContents;

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileContents() {
        return fileContents;
    }

    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

    public void writeFile() {
        // check if file exists
        // if not, create file
        if (!checkFileExists()) {
            createFile();
        }
        try {
            
            FileWriter fw = new FileWriter(fileName);
            fw.write(fileContents);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkFileExists() {
        return new java.io.File(fileName).exists();
    }

    public void createFile() {
        try {
            new java.io.File(fileName).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}