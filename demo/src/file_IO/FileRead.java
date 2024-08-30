
package file_IO;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\gunwants\\workspace\\src\\main\\java\\file_IO\\test.txt"));
            String line;

            while(scanner.hasNext()){
                line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

