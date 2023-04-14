package com.Amlan;
import java.util.Scanner;
abstract class plate{
    protected double length;
    protected double width;
    plate(){
        length=0.0;
        width=0.0;
    }
     plate(double length,double width){
        this.length=length;
        this.width=width;
    }
     abstract void plateDisplay();
}
class box extends plate{
    protected double height;
    box(){
        height=0.0;
    }
    public box(double length,double width,double height){
        super(length,width);
        this.height=height;
    }

    public void plateDisplay()
    {
        System.out.println("The Length of the box is: "+length);
        System.out.println("The Width of the box is: "+width);
        System.out.println("The Height of the box is: "+height);
    }
}
class woodbox extends box{
    protected double thick;
    woodbox(){
        thick=0.0;
    }
    public woodbox(double length,double width,double height,double thick){
        super(length,width,height);
        this.thick=thick;
    }
    public void plateDisplay(){
        System.out.println("The Length of the box is: "+length);
        System.out.println("The Width of the box is: "+width);
        System.out.println("The Height of the box is: "+height);
        System.out.println("The Thickness of the woodbox is: "+thick);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        plate k=new box(2,2,2);
//      box p=new box(2,3,4);
//      p.input();
      k.plateDisplay();
      woodbox w=new woodbox(1,2,3,4);
//      w.input();
      w.plateDisplay();
        }
}
