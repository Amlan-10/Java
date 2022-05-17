package com.Amlan;
import java.util.Scanner;
import java.util.Arrays;
public class maxarr {
    public static void main(String[] args) {
       int []arr={99,91,12,2,4,6,19,8};
        System.out.println(max(arr));
    }
    static int max(int []arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
