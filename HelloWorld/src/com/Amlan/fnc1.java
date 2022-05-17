package com.Amlan;
import java.util.Scanner;
public class fnc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String naam =sc.next();
        String a = sum(naam);
        System.out.println(a);
    }

static String sum(String b){

    String sum= "Hello " + b;
   return sum;
}
}