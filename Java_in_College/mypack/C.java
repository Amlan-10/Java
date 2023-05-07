package mypack;
//public class A {
//    public void mssg(){
//        System.out.println("Good morning");
//    }
//}
//class A {
//    static void f1(){System.out.print("a"); }}
//class C extends A {
//    static void f1(){System.out.print("b"); }
//    public static void main(String x[]){
//        A [] z={new A(), new C(), new A()};
//        for( int i=0;i<z.length;i++) {
//            z[i].f1(); }
//        C.f1();
//    } }
//Predict the output of the program?
//class A {
//    private final void f1(){System.out.print("a");}
//}
//class C extends A {
//    private final void f1(){System.out.print("b");}
//    public static void main(String x[]){
//        new C().f1();
//    } }
//class A {
//    String name="a";
//    String f1() {
//        return "hello";
//    }
//    }
//class P extends A {
//    String name="b";
//    String f1() {return "bye";}
//}
//public class C {
//    public static void main(String[] args) {
//        new C().f3();
//    }
//        void f3(){
//            A o= new P();
//            System.out.println( o.name + o.f1());
//        } }

class A {
    static String sing(){
        return "ha";
    }
}
class B extends A {
    static String sing(){
        return "la";}
    public static void main(String x[]){
        B b=new B();
        A c=new B();
        System.out.println(b.sing() + c.sing());
    } }