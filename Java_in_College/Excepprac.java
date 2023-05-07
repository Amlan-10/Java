public class Excepprac {
    public static void main(String[] args) {
        testExecutionPropagation t=new testExecutionPropagation();
        try{
            t.n();
        }
        catch (ArithmeticException e){
            System.out.println(e+" Handled");
        }
    }
}
class testExecutionPropagation{
    void m(){
        int a=9/0;
    }
    void n(){
        m();
    }
}