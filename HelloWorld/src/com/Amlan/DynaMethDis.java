package com.Amlan;
import java.util.Scanner;

class Shape1 {
    protected double area;
    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Triangle1 extends Shape1 {
    protected double base;
    protected double height;

    public Triangle1(double base,double height) {
        this.base = base;
        this.height=height;
        area = (0.5)* base * height;
    }
}

class Rectangle1 extends Shape1 {
    protected float length;
    protected float breadth;

    public Rectangle1(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }

}

public class DynaMethDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle : ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle : ");
        double height = sc.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float breadth = sc.nextFloat();


        Shape1 obj=new Triangle1(base,height);
        Shape1 obj1=new Rectangle1(length,breadth);

        System.out.println("The Area of triangle and rectangle respectively are:");
        obj.showArea();
        obj1.showArea();
    }
}