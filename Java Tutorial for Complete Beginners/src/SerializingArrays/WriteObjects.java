package SerializingArrays;

import SerializingArrays.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {

        Person[] people = {
                new Person(123, "Mike"),
                new Person(345, "Sue"),
                new Person(678, "Bob")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try(FileOutputStream fs = new FileOutputStream("test.bin");
            ObjectOutputStream os = new ObjectOutputStream(fs)){

            os.writeObject(people);
            os.writeObject(peopleList);
            os.writeInt(peopleList.size());
            for(Person person: peopleList){
                os.writeObject(person);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
