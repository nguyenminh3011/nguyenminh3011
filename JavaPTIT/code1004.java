import java.util.Scanner;

public class code1004 {
    public static void snt(int n){
        int t = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("NO");
                t = t  + 1;
                break;
            }
        }
        if(t == 0) System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            snt(n);
            t = t - 1;
        }
    }
}
