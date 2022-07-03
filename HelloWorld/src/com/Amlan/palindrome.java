package com.Amlan;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(checkpal(n));
    }
   public static boolean checkpal(int n){
        int rem,res=0,inival=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=res*10+rem;
        }

       return res == inival;
   }
}
