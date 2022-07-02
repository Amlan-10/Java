package com.Amlan;
import java.util.Scanner;
public class bit3 {
    public static int findMinXor(int[] A,int n) {
        int min_xor=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                min_xor=Math.min(min_xor, A[i] ^ A[j]);
            }

        }
        return min_xor;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findMinXor(A,n));
    }
}
//public class Solution {
//    public int findMinXor(int[] a) {
//        int n=a.length;
//        Arrays.sort(a);
//        int min=a[0]^a[1];
//        for(int i=2;i<n;i++){
//            min=Math.min(min,a[i]^a[i-1]);
//        }
//        return min;
//    }
//}

