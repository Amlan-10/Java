package com.Amlan;
import java.util.*;
import java.util.Arrays;

public class ksmallelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(kthSmallest(a,0,n,k));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {

        PriorityQueue<Integer>maxh=new PriorityQueue<>((a,b)->b-a);
        for(int i=l;i<r;i++){
            maxh.add(arr[i]);
            if(maxh.size()>k)
                maxh.poll();
        }
        return maxh.peek();
    }
}
//    int res=0;
//        Arrays.sort(arr);
//                res=arr[k-1];
//                return res;