package CreatingAndWritingTextFiles;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            br.write("This is line 1");
            br.write("This is line 2");
            br.newLine();
            br.write("This is last line");
            } catch (IOException e) {
            System.out.println("Can't read file " + file.toString());
        }
    }
}