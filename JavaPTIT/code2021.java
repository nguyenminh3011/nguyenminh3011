import java.util.Scanner;

public class code2021 {
    public static long lt(long a, long b){
        long mod = 1000000007;
        if(b == 0) return 1;
        else{
            long x = lt(a, b /2);
            if(b %2 == 0) return (x %mod) * (x %mod) %mod;
            else return ((a %mod) * (x %mod) %mod * (x %mod)) %mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }
            long m = lt(a, b);
            System.out.println(m);
        }
    }
}
