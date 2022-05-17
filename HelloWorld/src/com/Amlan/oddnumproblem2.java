package com.Amlan;
import java.util.Scanner;
public class oddnumproblem2 {
    public static int odd(int n) {
        int sum = 0;      if(n%2 != 0) {
            for (int i = 1; i <= n; i = i + 2) {

                sum = sum + i;
                 }
            }
        return sum;
    }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
 int sum = odd(n);
        System.out.println(sum);
}
}