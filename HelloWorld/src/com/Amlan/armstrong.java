package com.Amlan;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a 3 digit no. : ");
//        int n = sc.nextInt();
//        boolean ans=isArm(n);
//        System.out.println(ans);
        for(int i=100;i<=999;i++){
            if(isArm(i))
                System.out.print(i+" ");
        }
//            isArm(i);
//
//        }
    }
    static  boolean isArm(int n){
        int original_value=n,sum=0,rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);
        }
       return sum == original_value;
    }
//    static void isArm(int n) {
//        int original_value = n, sum = 0, rem;
//        while (n > 0) {
//            rem = n % 10;
//            n = n / 10;
//            sum = sum + (rem * rem * rem);
//        }
//        if(sum==original_value)
//            System.out.print(sum+" ");
//    }
    }

