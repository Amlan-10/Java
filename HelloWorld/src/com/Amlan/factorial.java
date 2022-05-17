package com.Amlan;
import java.util.Scanner;
public class factorial {
    public static int factorial(int a) {
        if(a<0){
            System.out.println("Invalid number");
        }
        int result = 1;
        for (int i = a; i >= 1; i--) {
            result = (result * i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
