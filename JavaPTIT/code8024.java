import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class code8024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(true){
                String s = q.poll();
                if(Long.parseLong(s) %n == 0){
                    System.out.println(s);
                    break;
                }
                q.add(s + "0");
                q.add(s + "9");
            }
        }
        sc.close();
    }
}
