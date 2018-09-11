package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MassiveWriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Bob"),new Person(2,"Mike"),new Person(3,"Tom")};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
//            FileOutputStream fos = new FileOutputStream("people.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeInt(people.length);
//
//            for (Person person:people) {
//                oos.writeObject(person);
//            }
            oos.writeObject(people);

//            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
