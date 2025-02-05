import java.util.Scanner;

public class code1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            long fa = 1;
            long fb = 1;
            long f = 0;
            if(n <= 1){
                System.out.println("YES");
            }
            else{
                while(f < n){
                    f = fa + fb;
                    fb = fa;
                    fa = f;
                }
                if(f == n){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            t = t - 1;
        }
    }
}
