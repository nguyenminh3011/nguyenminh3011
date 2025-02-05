import java.util.*;
public class test{
    static Scanner sc = new Scanner (System.in);
    public static boolean scp(long n){
        int sqrt = (int) Math.sqrt(n);
        return (long)sqrt * sqrt == n;
    }
    public static void main(String[] args){
        int tc = sc.nextInt();
        while(tc -->0){
            int n ; 
            n = sc.nextInt();
            Set <Long> set = new HashSet<>();
            for(int i = 0 ; i < n ; i ++){
                set.add(sc.nextLong());
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
                        break;
                    }
                }
            }
            if(check == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}