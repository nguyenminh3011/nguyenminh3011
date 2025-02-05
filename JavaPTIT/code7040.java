import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;

public class code7040 {
    public static void main(String[] args) throws ClassNotFoundException , IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        HashSet<String> set = new HashSet<>();
        for(String s : list){
            String[] a = s.toLowerCase().split("\\s+");
            for(String i : a){
                set.add(i);
            }
        }
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(set.contains(s)){
                System.out.println(s);
                set.remove(s);
            }
        }
        sc.close();
        ois.close();
    }
}
