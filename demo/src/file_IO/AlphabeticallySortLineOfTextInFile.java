package file_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticallySortLineOfTextInFile {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\gunwants\\workspace\\file_io.txt");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String line;
            List<String> linelist = new ArrayList<String>();
            while ((line = buffer.readLine()) != null){
                linelist.add(line);
            }
            reader.close();
            Collections.sort(linelist);

            FileWriter writer = new FileWriter("C:\\Users\\gunwants\\workspace\\write_file.txt");
            PrintWriter printWriter = new PrintWriter(writer);

            for(String test:linelist){
                printWriter.println(test);
            }

            printWriter.flush();
            printWriter.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
