package Enum;

public class UsingEnumDemo {
    public static void main(String[] args) {
        Learning learning = Learning.COREJAVA;
        switch(learning){
            case COREJAVA:
                System.out.println("Step 1 : Learn Core Java First");
                break;
            case COLLECTION:
                System.out.println("Step 2: To Learn Collection Framework");
                break;
            case SPRINGBOOT:
                System.out.println("Step 5 : To Learn Springboot Application");
                break;
            case MULTITRADING:
                System.out.println("Step 3 : To Learn Multithreading concepts to run  parellel programming");
                break;
            case JSPSPRINGHIBERNATE:
                System.out.println("Step 4 : To Learn JSP and Servlet Applications");
                break;
            default:
                System.out.println("It's up to you what you wish to learn :) ");
        }
    }
}
