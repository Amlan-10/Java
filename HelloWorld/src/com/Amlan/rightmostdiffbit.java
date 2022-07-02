package com.Amlan;
import java.util.Scanner;
public class rightmostdiffbit {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println(posOfRightMostDiffBit(m,n));
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m==n){
            return -1;
        }
        int count=0;int ans=0;
            ans = m ^ n;
            while(ans>0) {
                if((ans&1)==1)
                {
                    break;
                }
                ans=ans >> 1;
                count++;

            }
        return count+1;
    }
}
