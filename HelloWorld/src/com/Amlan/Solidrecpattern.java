package com.Amlan;
import java.util.Scanner;
public class Solidrecpattern {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        System.out.println("Enter the number of columns");
        m = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
     }
}

