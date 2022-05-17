package com.Amlan;
import java.util.Scanner;
public class problem1avg {
    public static int avg(int a , int b , int c) {
       int avgresult=(a+b+c)/3;
        return avgresult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avgresult = avg(a,b,c);
        System.out.println("The average of 3 numbers is : "+avgresult);
    }
}
