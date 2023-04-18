
public class EH7{
//    void msg() throws Exception{
//        System.out.println("Parent");
//    }
    void msg() throws Exception{
        System.out.println("Parent");
    }
}
class Sub1 extends EH7{
    void msg() throws ArithmeticException{
        System.out.println("Child");
    }

    public static void main(String[] args) {
        EH7 e=new Sub1();
        try{
        e.msg();}
        catch (Exception h){

        }
    }
}