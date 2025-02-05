import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class code7030 {
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
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1  = (ArrayList<Integer>) ois1.readObject();
        List<Integer> list2  = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(Integer i : list1){
            if(prime[i] == 1){
                set1.add(i);
            }   
        }
        for(Integer i : list2){
            if(prime[i] == 1){
                set2.add(i);
            }   
        }
        for(Integer i : set1){
            if(i >= N / 2){
                break;
            }
            if(set1.contains(N - i) && !set2.contains(i) && !set2.contains(N - i)){
                System.out.println(i + " " + (N - i));
            }
        }
    }
}
