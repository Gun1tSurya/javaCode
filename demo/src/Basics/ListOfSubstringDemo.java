package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfSubstringDemo {
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("COMMONWEALTH BANK OF AUSTRALIA");
        keywords.add("BANK OF WESTERN AUSTRALIA");
        keywords.add("WESTPAC BANKING CORP –NON CONTRACT");
        keywords.add("WESTPAC BANKING CORPORATION");

        String customerName = "WESTERN AUSTRALIA WESTPAC BANKING CORP –NON CONTRACT ";

        System.out.println("Check whthere customerName is available: " + isCustomerAvailable(customerName, keywords));
    }

    private static Boolean isCustomerAvailable(String customerName, List<String> keywords) {
    boolean flag = false;
        Iterator<String> iterator = keywords.iterator();
        while(iterator.hasNext()){
            if(customerName.contains(iterator.next())){
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}
