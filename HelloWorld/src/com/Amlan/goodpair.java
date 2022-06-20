package com.Amlan;
import java.util.Scanner;
import java.util.Arrays;
public class goodpair {
    public static void main(String[] args) {
        int []A=new int[100];
        int []B=new int[100];
        int t,c=0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();

        for(int j=0;j<n;j++){
            A[j]=sc.nextInt();
            B[j]=sc.nextInt();
        if(A[j]==B[j]) {
            c++;
        }
        }System.out.println(c);
            c=0;
        }
    }
}