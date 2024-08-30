package file_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadUsingBufferedReader {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\gunwants\\workspace\\file_io.txt");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line= br.readLine()) != null){
                List<String> list = new ArrayList<String>();
                list.add(line);
                list.stream().sorted().collect(Collectors.toList());
                    buffer.append(list);
                    buffer.append("\n");
            }
            reader.close();
            System.out.println("Contents of file using bufferdReader : " + buffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
