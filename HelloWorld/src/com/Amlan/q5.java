package com.Amlan;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        int sum=0,x=0,inValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n=sc.nextInt();
        inValue=n;
        while(n%10!=0)
        {
            x=n%10;
            sum=sum+(x*x*x);
            n=n/10;
        }
        if(sum==inValue)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
