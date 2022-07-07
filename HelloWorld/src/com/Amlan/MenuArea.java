package com.Amlan;
import java.util.*;
public class MenuArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int area;
        System.out.println("Enter 1 for circle,2 for square and 3 for rectangle");
        int c=sc.nextInt();
        switch (c){
            case 1:
                int r=sc.nextInt();
                System.out.println("The area of circle is: "+(3.14*r*r));
                break;
            case 2:
                int side=sc.nextInt();
                System.out.println("The area of square is: "+(side*side));
                break;
            case 3:
                int l= sc.nextInt();
                int b=sc.nextInt();
                System.out.println("The area of rectangle is: "+(l*b));
                break;
            default:
                System.out.println("Not possible");
        }
    }
}
