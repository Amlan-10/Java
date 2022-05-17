package com.Amlan;

public class triangle {
    public static void main(String[] args) {
       int num;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                  num=1;
                }
                else{
                    num=0;
                }
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
