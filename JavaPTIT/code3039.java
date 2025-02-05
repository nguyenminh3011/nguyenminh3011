import java.math.BigInteger;
import java.util.Scanner;

public class code3039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.compareTo(b) > 0){
                if(a.mod(b).compareTo(BigInteger.ZERO) == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(b.mod(a).compareTo(BigInteger.ZERO) == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}