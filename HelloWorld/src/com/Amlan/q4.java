package com.Amlan;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the value of n :");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%3==0)
            {
                sum+=i;
            }
        }
        System.out.println("The Sum is: "+sum);
    }
}
