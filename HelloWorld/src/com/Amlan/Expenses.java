//Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class “Manager” which uses this interface without implementing bonus() method. Also define another Java class “SubStaff” which extends from “Manager” class and implements bonus() method. Write the complete program to find out earnings, deduction and bonus of a sub-staff with basic salary amount entered by the user as per the following guidelines – earnings → basic + DA (80% of basic) + HRA (15% of basic) deduction PF → 12% of basic bonus → 50% basic //
package com.Amlan;
import java.util.Scanner;

interface Employee {
    void earnings();

    void deductions();

    void bonus();
}

 class Manager implements Employee {
    int basic;

    public Manager(int basic) {
        this.basic = basic;
    }

    public void earnings() {
        System.out.println("Earnings: " + (basic + (0.8 * basic) + (0.15 * basic)));
    }

    public void deductions() {
        System.out.println("Deductions: " + (0.12 * basic));
    }

    public void bonus() {
        System.out.println("Bonus: " + (0.5 * basic));
    }
}

class SubStaff extends Manager {
    public SubStaff(int basic) {
        super(basic);
    }

    public void bonus() {
        System.out.println("Bonus: " + (0.5 * basic));
    }
}

public class Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        int basic = sc.nextInt();
        SubStaff ss = new SubStaff(basic);
        ss.earnings();
        ss.deductions();
        ss.bonus();
    }
}
