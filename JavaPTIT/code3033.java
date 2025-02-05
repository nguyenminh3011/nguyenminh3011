import java.math.BigInteger;
import java.util.Scanner;

public class code3033 {
    static BigInteger gcd(BigInteger a, BigInteger b){
        if(a.compareTo(BigInteger.ZERO) == 0){
            return b;
        }
        else{
            return gcd(b.mod(a), a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ucln = gcd(a, b);
            BigInteger bcnn = (a.multiply(b)).divide(ucln);
            System.out.println(bcnn);
        }
        sc.close();
    }
}
