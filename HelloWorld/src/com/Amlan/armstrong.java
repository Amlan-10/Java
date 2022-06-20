package com.Amlan;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=100;i<=999;i++){
            if(isArm(i))
                System.out.print(i+" ");
        }
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
    }

