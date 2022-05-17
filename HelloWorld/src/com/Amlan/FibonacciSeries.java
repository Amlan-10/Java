package com.Amlan;
import java.util.Scanner;
public class  FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter till which number you want to print fibonacci series\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }
    }
}
