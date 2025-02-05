import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class code7005 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("DATA.IN");
        DataInputStream dis = new DataInputStream(fis);
        int[] a = new int[1000];
        for(int i = 0; i < 100000; i++){
            a[dis.readInt()]++;
        }
        
        for(int i = 0; i < 1000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
        fis.close();   
    }
}


