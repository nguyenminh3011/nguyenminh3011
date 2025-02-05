import java.util.Scanner;

public class code1011 {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a %b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int uc = gcd(a,b);
            long bc = (long)a * b / uc;
            System.out.printf("%d %d \n", bc, uc);
            t --;
        }
    }
}
