package com.Amlan;
import java.util.Scanner;
public class problem1 {
    static long power(long N,long R,long n)
    {
        long res=1;
        while(R>0){
            if((R&1)!=0){
                res=(res%n*N%n)%n;
            }
            N=(N%n*N%n)%n;
            R=R>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N;
        N=sc.nextLong();
        long R=reverse(N);
        System.out.println(power(N,R,1000000007));
    }
    public static long reverse(long N){
        long R=0,rem=0;
        while(N>0){
            rem=N%10;
            N=N/10;
            R=R*10+rem;
        }
        return R;
    }
}
