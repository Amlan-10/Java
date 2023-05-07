import java.io.*;
public class Parent{
    void msg()throws Exception{
        System.out.println("parent");}
}
class TestExceptionChild3 extends Parent{
    void msg()throws Exception{
        System.out.println("child");}
    public static void main(String args[]) throws Exception{
        Parent p=new TestExceptionChild3();
            p.msg();
//        catch(Exception e){
//        }
    }
    }
