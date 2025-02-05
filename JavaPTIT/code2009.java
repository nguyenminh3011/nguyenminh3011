import java.util.Scanner;
import java.math.BigInteger;

public class code2009 {
    public static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            boolean[] prime = new boolean[101];
        for(int i = 1; i <= 100; i++){
            prime[i] = true;
        }
        for(int i = 2; i <= Math.sqrt(100); i++){
            for(int j = i * i; j <= 100; j += i){
                prime[j] = false;
            }
        }
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 1; i <= n; i++){
            a[i] = i;
        }
        for(int i = 2; i <= n; i++){
            if(prime[a[i]]){
                for(int j = i + 1; j <= n; j++){
                    if(a[j] % a[i] == 0){
                        a[j] /= a[i];
                    }
                }
            }
        }
        for(int i = 2; i <= n; i++){
            System.out.printf(a[i] + " ");
        }
        BigInteger tich = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            tich = tich .multiply(BigInteger.valueOf(a[i]));
        }
        tich = tich.divide(BigInteger.valueOf(mod));
        System.out.println(tich);
        t--;
        }
        sc.close();
    }
}
