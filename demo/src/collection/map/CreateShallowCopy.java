package collection.map;

import java.util.HashMap;
import java.util.Map;

public class CreateShallowCopy {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String, String>();
        map.put("Pramod","Omni");
        map.put("Dhiraj","Cummince");
        map.put("Harshal","Amdocs");
        map.put("Roshan","Infosys");
        map.put("Tushar","Netflix");
        map.put("Bala","Haldiram");

        Map<String,String> newMap = new HashMap<String, String>();
        //newMap = (HashMap)map.clone();
    }
}
