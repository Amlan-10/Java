package com.Amlan;
import java.util.Scanner;
import java.util.Arrays;
public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        boolean [] isPrime= seiveofErato(n);
        for(int i=0;i<=n;i++)
        {
            System.out.println(i+" "+isPrime[i]);
        }
    }
    public static boolean[] seiveofErato(int n){
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j=j+i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}
