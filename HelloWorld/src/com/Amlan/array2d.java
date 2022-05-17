package com.Amlan;
import java.sql.SQLOutput;
import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int numbers[][]=new int [rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter the element for  "+ (i+1) + (j+1));
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
