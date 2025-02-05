import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class code7029 {
    public static final int N = (int) 1e6;
    public static int[] prime = new int[N + 1];
    public static void init(){
        for(int i = 0 ; i <= N; i++){
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for(int i = 2; i <= (int) 1e3 ; i++){
            if(prime[i] == 1){
                for(int j = i * i; j <= N; j += i){
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        init();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list  = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[N + 1];
        for(Integer i : list){
            a[i] += prime[i];
        }
        int dem = 0;
        for(int i = N; i >= 2; i--){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
                dem++;
                if(dem == 10){
                    break;
                }
            }
        }
        ois.close();
    }
}
