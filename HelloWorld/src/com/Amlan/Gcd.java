package com.Amlan;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd1(n1,n2));
//        while(n1 != n2) { //LCM*GCD=A*B
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is : "+ n2);
    }
    public static int gcd1(int a,int b){
        if(b==0)
            return a;
        else
           return gcd1(b,a%b);
    }
}
