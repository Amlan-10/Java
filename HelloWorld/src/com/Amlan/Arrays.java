package com.Amlan;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[]=new int[size];
       for(int i=0;i<size;i++)
       {
           numbers[i]=sc.nextInt();
       }
        System.out.println("Enter the number to be searched");
       int x =sc.nextInt();
       for(int i=0;i<numbers.length;i++)
       {
           if(numbers[i]==x){
           System.out.print("The number has been found in index :"+i);}
       }
    }
}
