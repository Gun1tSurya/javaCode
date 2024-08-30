package file_IO.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjct {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Bike",68147);
        Vehicle car = new Vehicle("Car",68148);

        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\gunwants\\workspace\\src\\main\\java\\file_IO\\serialize.dat")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bike);
            objectOutputStream.writeObject(car);
            System.out.println("Data written onto a file please check");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
