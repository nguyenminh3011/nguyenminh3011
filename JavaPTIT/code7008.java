import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class code7008 {
    static int n;
    static int[] a;
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DAYSO.in");
        Scanner sc = new Scanner(file);
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            List<Integer> current = new ArrayList<>();
            current.add(a[i]);
            generate(i, current);
        }
        Collections.sort(result);
        for(String s : result){
            System.out.println(s);
        }
    }
    private static void generate(int i , List<Integer> current){
        if(current.size() > 1){
            StringBuilder sb = new StringBuilder();
            for(Integer num : current){
                sb.append(num).append(" ");
            }
            result.add(sb.toString().trim());
        }
            for(int j = i + 1; j < n; j++){
                if(a[j] > current.get(current.size() - 1)){
                    current.add(a[j]);
                    generate(j, current);
                    current.remove(current.size() - 1);
                }
            }

    }
}
