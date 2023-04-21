import java.io.File;
import java.io.IOException;

public class create_file {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\KIIT\\Desktop\\LC.txt");
        if(f.createNewFile()){
            System.out.println("Success");
        }else{
            System.out.println("Exists");
        }
    }
}
