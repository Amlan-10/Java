package com.Amlan;
import java.sql.SQLOutput;
import java.util.Scanner;
public class bit2 {
        public static int findMinXor(int[] A, int n) {
            int min_xor=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
                for(int j=i+1;j<n;j++)
                    min_xor=Math.min(min_xor,A[i]^A[j]);
            return min_xor;
        }

        public static void main(String[] args){
            int A[]={0,2,5,7};
            int n=A.length;
            System.out.println(findMinXor(A,n));
        }
    }

