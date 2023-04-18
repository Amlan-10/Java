import java.io.*;
public class EH6 {
    void msg() throws ArithmeticException{
        System.out.println("Parent");
    }
}
class Sub extends EH6{
//    void msg()throws Exception{}   Compile time error
    void msg() throws ArithmeticException{
        System.out.println("Child");
    }

    public static void main(String[] args) {
        EH6 e=new Sub();
        e.msg();
    }
}