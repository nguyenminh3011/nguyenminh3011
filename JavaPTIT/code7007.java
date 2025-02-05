import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class code7007 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        String s;
        while(sc.hasNext()){
            s = sc.next().toLowerCase();
            set.add(s);
        }
        for(String i : set){
            System.out.println(i);
        }
        sc.close();
    }
}
