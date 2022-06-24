package com.Amlan;

import java.util.Scanner;

public class gfg {
    public static void main(String[] args) {
        int N,S,sum=0;int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        N=sc.nextInt();
        System.out.println("Enter the value of S:");
        S=sc.nextInt();
        int[] A = new int[N];
        for(i=0;i<N;i++){
           A[i] = sc.nextInt();}

        for(k=0;k<N;k++) {
            for (j = 0; j < N; j++) {
                while(sum<S){
                sum = sum + A[j]+A[j-k];}
                if (sum == S)
                    System.out.print((k));

            }
        }
    }
}
