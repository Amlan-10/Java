package com.Amlan;
import java.util.Scanner;
public class Swt {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String fruit =in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
