package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadMassiveOfOjects {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

//            int personCount = ois.readInt();
//
//            Person[] people = new Person[personCount];
//
//            for (int i = 0;i <  personCount;i++){
//                people[i] = (Person) ois.readObject();
//            }
            Person[]people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
//            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
