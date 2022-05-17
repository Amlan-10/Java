package com.Amlan;
import java.util.Scanner;
public class zerone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
