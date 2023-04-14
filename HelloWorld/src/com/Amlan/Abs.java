package com.Amlan;
public class Abs {
    public static void main(String[] args) {
Circle123 a=new Circle123();
a.CalculateArea();
Triangle123 b=new Triangle123();
b.CalculateArea();
Rectangle123 c=new Rectangle123();
c.CalculateArea();
    }
}
abstract class Shape123{
    abstract void CalculateArea();
}
class Circle123 extends Shape123{
    float radius;
    Circle123(){
        radius=10;
    }
    void CalculateArea(){
        System.out.println(3.14*(radius)*(radius));
    }
}
class Triangle123 extends Shape123{
    float base,height;
    Triangle123(){
        base=4;
        height=12;
    }
    void CalculateArea(){
        System.out.println(0.5*base*height);
    }
}
class Rectangle123 extends Shape123{
    float length,breadth;
    Rectangle123(){
        length=2;
        breadth=3;
    }
    void CalculateArea(){
        System.out.println(length*breadth);
    }
}