//2.      Write a java program to create Account with 500 rupee
//        minimum balance, deposit amount, withdraw amount and
//        also throws LessBalanceException which returns the
//        statement that says withdraw amount is not valid.
import java.util.*;

import static java.lang.System.exit;

class LessBalanceException extends Exception{
    LessBalanceException(String s){
        super(s);
    }
}
public class lab8_Q2 extends Account{
    public static void main(String[] args) {
        Account a=new Account();
        a.getCurrent_Bal();
        a.getDeposit_Amt();
        a.getWithdraw_Amt();
        try {
            a.UpdatedBalance();
        }
        catch(LessBalanceException e){
            System.out.println(e);
        }
    }
}
class Account{
    double Deposit_Amt,Withdraw_Amt,Current_Bal;
    Scanner sc=new Scanner(System.in);
    public void getDeposit_Amt() {
        System.out.println("Enter the Deposit Amount: ");
        Deposit_Amt=sc.nextDouble();
        System.out.println("The Deposit Amount is: "+Deposit_Amt);

    }public void getWithdraw_Amt() {
        System.out.println("Enter the Withdraw Amount: ");
        Withdraw_Amt=sc.nextDouble();
        System.out.println("The Withdraw Amount is: "+Withdraw_Amt);
    }
    public void getCurrent_Bal(){
        System.out.println("Enter the Current Balance: ");
        Current_Bal=sc.nextDouble();
        if(Current_Bal>=500)
            System.out.println("The Current Balance is: "+Current_Bal);
        else
            System.out.println("Current Balance has to be atleast 500 ");
        exit(0);
    }
    public void UpdatedBalance()throws LessBalanceException{
        if(Withdraw_Amt>Current_Bal || Current_Bal<500){
            throw new LessBalanceException("BALANCE INSUFFICIENT!!!");
        }else{
            Current_Bal+=Deposit_Amt-Withdraw_Amt;
        System.out.println("The Updated Balance is: "+Current_Bal);
        }
    }
}