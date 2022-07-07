package com.Amlan;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int max=0,sum=0;
        System.out.println("Enter the marks of the subjects: ");
        for(int i=0;i<5;i++)
        {
             arr[i]=sc.nextInt();
             sum+=arr[i];
             if(arr[i]>max){
                 max=arr[i];}
        }
        System.out.println("The highest marks is: "+max+" and the average is: "+sum/5);
    }
}
