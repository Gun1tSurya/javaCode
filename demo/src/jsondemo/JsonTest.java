/*
package jsondemo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonTest {
    public static void main(String[] args) {
        try {
            writeJsonSimpleDemo("C:\\Users\\gunwants\\Desktop\\Json_Test\\example.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeJsonSimpleDemo(String fileName) throws IOException {
        JSONObject sampleObject = new JSONObject();
        sampleObject.put("Name","Stackabuser");
        sampleObject.put("Age",36);
        sampleObject.put("Occupation","Business");
        sampleObject.put("Contact",57850);

        JSONArray messages = new JSONArray();
        messages.add("Something");
        messages.add("another");
        sampleObject.put("Messages",messages);

        Files.write(Paths.get(fileName), sampleObject.toString().getBytes());

    }
}
*/
