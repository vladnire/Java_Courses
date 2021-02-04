package TransientKeyword;

import TransientKeyword.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.bin"))){

            Person person = new Person(123, "Mike");
            Person.setCount(88);
            os.writeObject(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
