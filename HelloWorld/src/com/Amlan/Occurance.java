package com.Amlan;
import java.util.Scanner;
public class Occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n = in.nextInt();
        System.out.println("Enter the number whose occurance is needed");
        int a = in.nextInt();
        int c = 0;
        while(n>a)
        {
            int b = n % 10;
            n = n/10;
            if(b==a)
            {
                c++;
            }
        }System.out.println("The occurance of "+ a +" is "+ c);
    }
}
