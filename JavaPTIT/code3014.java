import java.util.Scanner;
import java.math.BigInteger;

public class code3014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = 1;
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b);
            StringBuilder sb = new StringBuilder(c.toString());
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
