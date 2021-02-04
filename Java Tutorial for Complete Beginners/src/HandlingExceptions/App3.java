package HandlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App3 {
    public static void main(String[] args){
        try{
            openFile();
        } catch (FileNotFoundException e){
            // e.printStackTrace();
            // Message too vague
            System.out.println("File not found");
        }
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
    }
}
