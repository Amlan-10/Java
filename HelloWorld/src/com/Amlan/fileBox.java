package com.Amlan;
import java.util.Scanner;
public class fileBox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b,h;
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        System.out.println("The Volume is : "+volume(l,b,h));
    }
    public static int volume(int length,int breadth,int height){
        return (length*breadth*height);
    }
}
