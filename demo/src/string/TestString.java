package string;

import java.util.ArrayList;

public class TestString {
    public static void main(String[] args) {
      getArrayListData();
    }

    public static void getArrayListData() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Abc");
        stringArrayList.add("xyz");
        stringArrayList.add("cad");
        stringArrayList.add("mad");
            System.out.println(stringArrayList);
    }
}
