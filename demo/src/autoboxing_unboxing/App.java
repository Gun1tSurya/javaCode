package autoboxing_unboxing;

import java.util.ArrayList;

class intWrapper{
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }
    public int getIntValue() {
        return intValue;
    }
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}


public class App {
    public static void main(String[] args) {
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);  // AutoBoxing
        System.out.println(arrayList.get(0));*/

        /*ArrayList<intWrapper> intWrappers = new ArrayList<>();
        intWrappers.add(new intWrapper(50)); // Boxing
        System.out.println(intWrappers.get(0).getIntValue());  //unboxing*/

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(605555.345);
        doubleArrayList.add(60.24);
        doubleArrayList.add(Double.valueOf(234));  // This is done while autoboxing
        System.out.println(doubleArrayList.get(0));
        System.out.println(doubleArrayList.get(1).doubleValue());



    }
}
