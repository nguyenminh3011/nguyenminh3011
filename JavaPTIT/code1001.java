import java.util.Scanner;

public class code1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int m = (int)Math.sqrt(n);
            if(Math.pow(m,2) == n) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}

