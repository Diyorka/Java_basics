package Serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people =  {new Person(1, "Diyor"),
                new Person(2, "Aziz"), new Person(3, "Kolya")};

        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

//            ous.writeInt(people.length);
//
//            for(Person person:people){
//                ous.writeObject(person);
//            }

            ous.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
