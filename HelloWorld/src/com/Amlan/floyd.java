package com.Amlan;
import java.util.Scanner;
public class floyd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(sum+" ");sum++;
            }for(int f=1;f<=n-i-1;f++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
