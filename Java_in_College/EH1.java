import java.util.*;

public class EH1 {
    public static void main(String[] args) {
        System.out.println("Main method Started...");
        int a=10,b=0;
        int [] arr=new int[5];
        try {
            arr[10] = a / b;
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e){
//            System.out.println(e);
            System.out.println("Cannot divide by Zero");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Main method Ended...");
    }
}
