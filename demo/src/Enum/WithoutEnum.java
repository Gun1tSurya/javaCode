package Enum;

public class WithoutEnum {

    private static final int COREJAVA = 1;
    private static final int MULTITHREADING = 3;
    private static final int COLLECTION = 2;
    private static final int JSPSERVLET = 4;
    private static final int SPRINGBOOTAPPLICATION = 5;

    public static void main(String[] args) {
        int learning = 7;
        switch (learning){
            case COREJAVA:
                System.out.println("Step 1 : First Learn Core Java");
                break;
            case SPRINGBOOTAPPLICATION:
                System.out.println("Step 5 : To Learn SpringBoot Applications");
                break;
            case MULTITHREADING:
                System.out.println("Step 3 : To Learn Multithreading concepts for parellel programming");
                break;
            case COLLECTION:
                System.out.println("Step 2 : To Learn Collection Concept");
                break;
            case JSPSERVLET:
                System.out.println("Step 4 : To Learn JSP and Servet on GUI purpose");
                break;
            default:
                System.out.println("IT's up to you what to learn :) ");
        }
    }
}
