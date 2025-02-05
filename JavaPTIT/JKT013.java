import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int dem = 0;
            for(int i = 0; i < n; i++){
                dem += Math.pow(2, i);
            }
            ArrayList<Long> ts = new ArrayList<>();
            int tmp = dem;
            Queue<String> q = new LinkedList<>();
            q.add("8");
            while(tmp -- > 0){
                String s = q.poll();
                long x = Long.parseLong(s);
                ts.add(x);
                q.add(s + "8");
                q.add(s + "6");
            }
            q.clear();
            q.add("6");
            tmp = dem;
            while(tmp -- > 0){
                String s = q.poll();
                Long x = Long.parseLong(s);
                ts.add(x);
                q.add(s + "8");
                q.add(s + "6");
            }
            System.out.println(dem * 2);
            Collections.sort(ts, new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    return o1 < o2 ? 1 : -1;
                }
            });
            for(Long s : ts){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
