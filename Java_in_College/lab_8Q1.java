//        Write a Java class which has a method called
//        ProcessInput(). This method checks the number entered
//        by the user. If the entered number is negative then throw
//        an user defined exception called
//        NegativeNumberException, otherwise it displays the
//        double value of the entered number.

import javax.xml.stream.events.ProcessingInstruction;
import java.util.Scanner;

class NegativeNumException extends Exception{
        NegativeNumException(String s){
            super(s);
        }
    }
public class lab_8Q1 {
    static double d=0;
    static void ProcessInput(int n)throws NegativeNumException{
        if(n<0){
            throw new NegativeNumException("not valid");
        }
        else{
            d=n;
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check ");
        a=sc.nextInt();
        try{
            ProcessInput(a);
        }
        catch(Exception m){
            System.out.println("Exception handled: "+m);
            System.out.println("Rest of the code");
        }
    }
}
