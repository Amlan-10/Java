package com.Amlan;
import java.util.Arrays;
import java.util.Scanner;
public class swaparray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,8};
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        swap(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
