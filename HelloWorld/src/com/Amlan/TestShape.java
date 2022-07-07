package com.Amlan;
import java.util.Scanner;
class Shape {
    protected double area;

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(double base,double height) {
        this.base = base;
        this.height=height;
        area = (0.5)* base * height;
    }

    public void showArea() {
        System.out.println("Triangle Area: " + area);
    }
}

class Rectanglee extends Shape {
    protected double length;
    protected double breadth;

    public Rectanglee(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }

    public void showArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

public class TestShape {
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

        Triangle c = new Triangle(base,height);
        Rectanglee r = new Rectanglee(length, breadth);

        c.showArea();
        r.showArea();
    }
}