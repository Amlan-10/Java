import java.util.*;
class bike1 {
    int ans=1;
        void run(){
            System.out.println("Running");
        }
    }
    class Splender extends bike1{
    int ans=2;
    void run(){
        System.out.println("Running in safe speed");
    }
}
public class bike{
    public static void main(String[] args) {
//        Splender s=new Splender();
//        s.run();
//        bike1 b = new bike1();
//        b.run();
        bike1 p=new Splender();
        p.run();
        int ans = p.ans;
        System.out.println(ans);
    }
}
