import java.io.IOException;

class EH5 {
    void m() throws IOException {
        throw new java.io.IOException("Device Error");
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        EH5 e=new EH5();
        e.p();
    }
}