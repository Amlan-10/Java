package com.Amlan;
import java.util.Scanner;
class plate{
    protected double length;
    protected double width;
    public plate(double length,double width){
        this.length=length;
        this.width=width;
    }
    public void plateDisplay()
    {
        System.out.println("The Length of the Plate is: "+length);
        System.out.println("The Width of the Plate is: "+width);
    }
}
class box extends plate{
    protected double height;
    public box(double length,double width,double height){
        super(length,width);
        this.height=height;
    }
    public void boxDisplay()
    {
        System.out.println("The Length of the box is: "+length);
        System.out.println("The Width of the box is: "+width);
        System.out.println("The Height of the box is: "+height);
    }
}
class woodbox extends box{
    protected double thick;
    public woodbox(double length,double width,double height,double thick){
        super(length,width,height);
        this.thick=thick;
    }
    public void woodboxDisplay(){
        System.out.println("The Length of the box is: "+length);
        System.out.println("The Width of the box is: "+width);
        System.out.println("The Height of the box is: "+height);
        System.out.println("The Thickness of the woodbox is: "+thick);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice:");
        System.out.println("1:plate 2:box 3:woodenbox");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter the length of the plate : ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the plate : ");
                double width = sc.nextDouble();
                plate ob=new plate(length,width);
                ob.plateDisplay();
                break;
            case 2:
                System.out.print("Enter the length of the box : ");
                double blength = sc.nextDouble();
                System.out.print("Enter the width of the box : ");
                double bwidth = sc.nextDouble();
                System.out.println("Enter the height of the box: ");
                double bheight=sc.nextDouble();
                box ob1=new box(blength,bwidth,bheight);
                ob1.boxDisplay();
                break;
            case 3:
                System.out.print("Enter the length of the box : ");
                double wblength = sc.nextDouble();
                System.out.print("Enter the width of the box : ");
                double wbwidth = sc.nextDouble();
                System.out.println("Enter the height of the box: ");
                double wbheight=sc.nextDouble();
                System.out.println("Enter the thickness of the box: ");
                double wbthick=sc.nextDouble();
                woodbox ob2=new woodbox(wblength,wbwidth,wbheight,wbthick);
                ob2.woodboxDisplay();
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
