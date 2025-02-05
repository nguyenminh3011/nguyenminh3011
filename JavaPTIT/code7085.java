import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class code7085 {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        ois.close();
        for(String i : list){
            StringBuilder sb = new StringBuilder(i);
            for(int j = 0; j < sb.length(); j++){
                if(sb.charAt(j) - '0' > 9){
                    sb.deleteCharAt(j);
                    j--;
                }
            }
            int sum = 0;
            for(int j = 0; j < sb.length(); j++){
                sum += sb.charAt(j) - '0';
            }
            while(true){
                if(sb.charAt(0) == '0'){
                    sb.deleteCharAt(0);
                }else{
                    break;
                }
            }
            System.out.println(sb.toString() + " " + sum);
        }
    }
}
