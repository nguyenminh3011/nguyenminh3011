import java.util.Scanner;

public class code1014 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            long ans = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                while(n %i == 0){
                    ans = i;
                    n = n/ i;
                }
            }
            if(n != 1) ans = n;
            System.out.println(ans);
            t--;
        }
    }
}
