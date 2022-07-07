package com.Amlan;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num=new int[n];
        int max=0,min=num[1];
        int x=0,y=0;
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
            if(num[i]>max){
                max=num[i];
                x=i;
            }
            if(num[i]<min){
                min=num[i];
                y=i;
            }
        }
        swap(x,y,num,n);
       display(num,n);
    }
    public static void swap(int a,int b,int[] num,int n)
    {
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
    public static void display(int[] num,int n){
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
