package com.Amlan;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float area=0,perimeter=0;
        System.out.println("Enter the radius of circle :");
        float r=sc.nextInt();
        area= (float) (3.14*r*r);
        perimeter=(float)(2*3.14*r);
        System.out.println("The Area of the circle is: "+area);
        System.out.println("The Perimeter of the circle is: "+perimeter);
    }
}
