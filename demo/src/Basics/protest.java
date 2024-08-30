package Basics;

import java.util.Arrays;

public class protest {
    public static void main(String[] args) {

        String eplId = "Proabc";
        String PRO = "Pro";
        String customerName = "";
        String CUSTOMER_NAME_LIST = "COMMONWEALTH BANK OF AUSTRALIA (CBA) OPERATIONS,COMMONWEALTH BANK OF AUSTRALIA (CBA),BANK OF WESTERN AUSTRALIA,DEPARTMENT OF DEFENCE (DoD),NATIONAL AUSTRALIA BANK(NAB),WESTPAC BANKING CORP –NON CONTRACT,WESTPAC BANKING CORPORATION,QANTAS AIRWAYS";
        if (((PRO.equalsIgnoreCase(eplId.substring(0, 3)) && Arrays.stream(CUSTOMER_NAME_LIST.split(",")).anyMatch(t -> t.equalsIgnoreCase(customerName))) || PRO.equalsIgnoreCase(eplId.substring(0, 3)))) {
            System.out.println("Condintion pass");
        }else{
            System.out.println("not passed");
        }
    }
}
