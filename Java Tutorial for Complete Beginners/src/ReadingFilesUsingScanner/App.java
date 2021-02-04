package ReadingFilesUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // String fileName = "C:\\Java\\Java_Courses\\Java_Courses\\Java Tutorial for Complete Beginners\\src\\ReadingFilesUsingScanner\\example.txt";
        String fileName = "example.txt";
        File textFile = new File(fileName);
        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read int value: " + value);
        in.nextLine();

        int count = 2;
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        in.close();
    }
}
