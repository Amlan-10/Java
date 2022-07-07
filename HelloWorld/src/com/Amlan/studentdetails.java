package com.Amlan;
import java.util.Scanner;
public class studentdetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students ");
        n=sc.nextInt();
        int[] roll=new int[n];
        String[] name=new String[n];
        float[] cgpa=new float[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter name,roll and cgpa of student number "+i+": ");
            name[i]= sc.next();
            roll[i]=sc.nextInt();
            cgpa[i]=sc.nextFloat();
        }
        lowest(n,cgpa,name);
    }
    public static void lowest(int n,float[] cgpa,String[] name){
        float min=cgpa[1];
        String nam=name[1];
        for(int i=0;i<n;i++){
            if(cgpa[i]<min)
            {
                min=cgpa[i];
                nam=name[i];
            }
        }
        System.out.println("The minimum cgpa is: "+min+" and his name is: "+nam);
    }
}
