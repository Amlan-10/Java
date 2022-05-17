package com.Amlan;
import java.util.Scanner;
public class fncprimebol {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n)
    {
        int p=0;
        if(n<=1)
        { return false;
        }
      for(int i=1;i<=n;i++){
          if(n%(i)==0){
              p++;
          }
      }
        if(p==2){
            return true;
        }else {
            return false;
        }
    }
}
