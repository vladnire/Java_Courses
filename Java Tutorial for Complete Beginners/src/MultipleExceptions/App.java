package MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args){
        Test test = new Test();
        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Could not parse command.");
        }
        */

        // Try multi-catch
        /*
        try {
            test.run();
        } catch (IOException | ParseException e){
            e.printStackTrace();
        }
        */

        try {
            test.run();
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            test.input();
        // IOException will catch FileNotFoundException
        // this is why we use them in this order
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not parse command.");
        }
    }
}
