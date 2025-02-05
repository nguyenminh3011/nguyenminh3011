import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class code7002 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        BigInteger n = sc.nextBigInteger();
        int leng = n.toString().length();
        while(leng != 1){
            BigInteger a = BigInteger.valueOf(10).pow(leng/2);
            if(leng %2 != 0){
                a = a.multiply(BigInteger.valueOf(10));
            }
            n = n.divide(a).add(n.mod(a));
            leng = n.toString().length();
            System.out.println(n);
        }
        sc.close();
    }
}
