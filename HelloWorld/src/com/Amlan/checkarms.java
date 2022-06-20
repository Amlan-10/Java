package com.Amlan;
import java.util.Scanner;
public class checkarms {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        boolean ans=isArms(n);
        System.out.println(ans);
    }
    static boolean isArms(int n){
        int initialvalue=n,sum=0,rem;
        while(n>0){
        rem=n%10;
        n=n/10;
        sum=sum+(rem*rem*rem);
        }
        if(sum == initialvalue)
           return true;
        else
            return false;
    }
}
