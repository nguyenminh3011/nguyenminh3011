import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class code7032{
    public static boolean check(Integer n){
        String s = n.toString();
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        if(s.length() %2 == 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) %2 == 0){
                return false;
            }
        }
        return true;

        
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) ois1.readObject();
        List<Integer> list2 = (List<Integer>) ois2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] a1= new int[1000001];
        int[] a2= new int[1000001];
        for(Integer i : list1){
            a1[i] ++;
            set1.add(i);
        }
        for(Integer i : list2){
            a2[i] ++;
            set2.add(i);
        }
        int dem = 0;
        for(Integer i : set1){
            if(check(i) && set2.contains(i)){
                System.out.printf("%d %d\n", i , a1[i] + a2[i]);
                dem ++;
            }
            if(dem == 10){
                break;
            } 
        }
        ois1.close();
        ois2.close();
    }
}