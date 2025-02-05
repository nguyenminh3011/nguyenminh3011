import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class code7015 {
    public static int[] sang = new int[10000];
    public static void songuyento(){
        for(int i = 0; i < 10000; i++){
            sang[i] = 1;
        }
        sang[0] = sang[1] = 0;
        for(int i = 2; i < 10000; i ++){
            if(sang[i] == 1){
                for(int j = i * i; j < 10000; j += i){
                    sang[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        songuyento();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[10000];
        for(Integer i : list){
            a[i] += sang[i];
        }
        for(int i = 2; i < 10000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
        ois.close();
    }
}
