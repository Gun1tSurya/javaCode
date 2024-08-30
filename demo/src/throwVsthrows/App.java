package throwVsthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {

        try {
            //something();
            someMethod();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (UserDefinedException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Inside main exception");
        }
    }

    private static void something() throws Exception { // throws is used for handling an unhandled exceptions.
        System.out.println("Inside something method ");
        throw new FileNotFoundException(); // throw keyword is used to explicitly throw an Exception.
    }

    private static void someMethod() throws Exception,FileNotFoundException,UserDefinedException {

        int x = 3;
        switch (x){
            case 1: throw new FileNotFoundException();
            //break; //Unrechable statement
            case 2 : throw new Exception();
                default: throw new UserDefinedException();
        }
    }
}
