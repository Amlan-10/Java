package com.Amlan;
import java.util.Scanner;
public class firstPower {
    public static void main(String[] args) {
        System.out.println(firstpow(3978432,5,1000000007));
    }

    public static long firstpow(long a, long b,long n) {
        long res=1;
        while(b>0){
            if((b&1) !=0)
            {
            res=((res%n)*(a%n))%n;
            }
            a=((a%n)*(a%n))%n;
            b=b>>1;
        }
         return res;
    }
}
