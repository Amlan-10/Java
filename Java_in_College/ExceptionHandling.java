import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Main method Started...");
        int a=10,b=0;
        try {
            int c = a / b;
        System.out.println(c);
        }
        catch(Exception e){
//            System.out.println(e);
            System.out.println("Cannot divide by Zero");
        }
        System.out.println("Main method Ended...");
    }
}
