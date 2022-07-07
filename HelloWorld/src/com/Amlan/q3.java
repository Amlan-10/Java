package com.Amlan;
import java.util.Scanner;
public class q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y && x>z){
            System.out.println(x+"is greatest");
        }
        else if(y>x && y>z){
            System.out.println(y+"is greatest");
        }
        else{
            System.out.println(z+"is greatest");
        }
    }
}
