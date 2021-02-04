package ReadingFilesWithFileReader;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Can't read file " + file.toString());
        }
    }
}
