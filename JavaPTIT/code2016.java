import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class code2016 {
    public static boolean scp(long n){
        int sqrt = (int) Math.sqrt(n);
        return (long)sqrt * sqrt == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Set<Long> set = new HashSet<>();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                set.add((long)x);
            }
            boolean check = false;
            List <Long> arr = new ArrayList<>(set);
            for(int i = 0 ; i < arr.size() ; i ++){
                for(int j = i + 1 ; j < arr.size() ; j ++){
                    long tmp1 =  (long)arr.get(i) * arr.get(i);
                    long tmp2 =  (long)arr.get(j) * arr.get(j);
                    long tmp3 = tmp1 + tmp2;
                    long tmp = (long) Math.sqrt(tmp1 + tmp2);
                    if(set.contains(tmp) && scp(tmp3)){
                        check = true;
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if(check == false){
                System.out.println("NO");
            }
        }  
        sc.close();
    }
}
