import java.util.*;
public class permutaionstrs {
    public static void main(String[] args) {
        String str="ABC";
        permutaion p=new permutaion();
        p.String_Str(str,"");
    }
}
class permutaion{
    void String_Str(String str,String ans){
        if(str.length()==0){
            System.out.println(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            String_Str(ros,ans+ch);
        }
    }
}
