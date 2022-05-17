package com.Amlan;
import java.util.Scanner;
public class fncmultiply {
    public static int multiplyresult(int a,int b) {
        int result=(a*b);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiplyresult(a,b);
        System.out.println("The result is : "+ result);
    }
}
