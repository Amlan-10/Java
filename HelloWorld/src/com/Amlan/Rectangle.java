package com.Amlan;
import java.util.Scanner;
public class Rectangle {
    public Rectangle(double length, double breadth) {
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b;
        l= sc.nextInt();
        b= sc.nextInt();
        calculate(l,b);
    }
        public static void calculate(int length,int breadth){
        int area=length*breadth;
        int perimeter=2*(length+breadth);
            System.out.print("The area of the triangle is: "+area+" and the perimeter is: "+perimeter);
    }

    public void display() {
    }
}
