package Quiz;

import javafx.beans.property.MapProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class quizeone {
    public static void main(String[] args) {
        int i = 012;  // 0 indicate value start with Octal i.e. 012 is 10 Octal is starting from 010 i.e 8
        int j = 06;   // 0 indicate value start with Octal i.e. 06 is 6
        System.out.println(i);
        System.out.println(j);

        Map<String,String> map  = new HashMap<>();
        map.put("Type","Intervention");
        map.put("Type1","Resolution");
        map.put("ReasonCode","");
        //map.get("")
          String str = String.valueOf(map.keySet().equals("ReasonCode"));
        System.out.println(str);
          if(str.equals("false")){
              System.out.println("Heelo");
          }
          else
              System.out.println("yyyyyyyy");




    }
}
