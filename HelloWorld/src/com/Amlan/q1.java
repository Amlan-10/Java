package com.Amlan;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        double sqrt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n=sc.nextDouble();
            sqrt=SquareRoot(n);
        System.out.println("The square root of "+n+" is: "+sqrt);
    }
    public static double SquareRoot(double n)
    {
        int i=1;
        while(true){
            if(i*i==n)
            {
                return i;
            }
            else if(i*i>n)
            {
                return 0;
            }i++;
        }
    }
}
