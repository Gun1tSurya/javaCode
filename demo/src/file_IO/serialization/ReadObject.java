package file_IO.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\gunwants\\workspace\\src\\main\\java\\file_IO\\serialize.dat")){
            try(ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                Vehicle v1 = (Vehicle) objectInputStream.readObject();
                Vehicle v2 = (Vehicle) objectInputStream.readObject();
                System.out.println("Result of object1: " + v1);
                System.out.println("Result of object2: " + v2);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
