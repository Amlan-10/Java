package com.Amlan;
import java.util.Scanner;
public class hollowrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n=sc.nextInt();
        System.out.print("Enter the no. of column :");
        int p=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                if(i==(n-1) || i==0 || j==(p-1) || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
