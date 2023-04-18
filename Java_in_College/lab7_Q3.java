//3.      Define an interface with three methods – earnings(), deductions()
//        and bonus() and define a Java class “Manager” which uses this
//        interface without implementing bonus() method. Also define
//        another Java class “SubStaff” which extends from “Manager”
//        class and implements bonus() method. Write the complete
//        program to find out earnings, deduction and bonus of a sub-staff
//        with basic salary amount entered by the user as per the following
//        guidelines –
//        earnings → basic + DA (80% of basic) + HRA (15% of basic)
//        deduction PF → 12% of basic
//        bonus → 50% basic
import java.util.*;
interface Employee1{
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}
abstract class Manager1 implements Employee1{
    public double earnings(double basic){
        return basic+(0.8*basic)+(0.15*basic);
    }
    public double deductions(double basic){
        return (0.12*basic);
    }
}
class SubStaff1 extends Manager1{
    public double bonus(double basic){
        return basic*0.5;
    }
}
public class lab7_Q3  {
    public static void main(String[] args) {
        SubStaff1 s=new SubStaff1();
        System.out.println("Earnings: "+s.earnings(10000));

        System.out.println("Deductions: "+ s.deductions(10000));

        System.out.println("Bonus: "+s.bonus(10000));

    }
}
