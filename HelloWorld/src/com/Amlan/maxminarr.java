package com.Amlan;
import java.util.Scanner;
public class maxminarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long i,n;long[] a;
        n=sc.nextInt();
        a =new long[(int) n];
        for(i=0;i<n;i++)
        {
            a[(int) i]=sc.nextInt();
        }
        getMinMax(a,n);
    }
    static void getMinMax(long []a, long n)
    {
        long max=0;long min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            else if(a[i]<min)
                min=a[i];
        }
        System.out.print("min = "+min+" "+"max = "+max);
    }

}
