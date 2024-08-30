package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class TestEqualsAndCompareMethod {
    public static void main(String[] args) {
        class Code {
            private  String lectureCode;
            private  String sectionCode;

            public Code(String lectureCode, String sectionCode) {
                this.lectureCode = lectureCode;
                this.sectionCode = sectionCode;
            }
            public String getLectureCode() {
                return lectureCode;
            }

            public String getSectionCode() {
                return sectionCode;
            }

            @Override
            public String toString() {
                return "Code{" +
                        "lectureCode='" + lectureCode + '\'' +
                        ", sectionCode='" + sectionCode + '\'' +
                        '}';
            }
        }

        /*public String compareCode(String code1,String code2){

        }*/

        Map<Code,String> map = new HashMap<>();
        map.put(new Code("L01","SC01"),"Physics");
        map.put(new Code("L01","SC01"),"Maths");
        map.put(new Code("L02","SC03"),"Chemestry");
        map.put(new Code("L03","SC02"),"Bio");
        map.put(new Code("L04","SC04"),"Sanskrit");
        map.put(new Code("L06","SC06"),"Science");


        for(Map.Entry<Code,String> entryset:map.entrySet()){
            System.out.println("Print key only: "+ entryset.getKey() + "Printing values only: "+ entryset.getValue());
        }
    }
}
