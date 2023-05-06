
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary");
        double basic =sc.nextDouble();
        SubStaff s=new SubStaff();
        System.out.println("Earnings: "+s.earnings(basic));
        System.out.println("Deductions: "+s.deductions(basic));
        System.out.println("Bonus: "+s.bonus(basic));
    }
}
interface Employee{
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}
abstract class Manager implements Employee{
    public double earnings(double basic){
        return (basic+(0.8*basic)+(0.15*basic));
    }
    public double deductions(double basic){
        return 0.12*basic;
    }
}
class SubStaff extends Manager{
    public double bonus(double basic){
        return 0.5*basic;
    }
}