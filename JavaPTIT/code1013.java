import java.util.Scanner;

public class code1013 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean[] prime = new boolean[2000001];
        for(int i = 2; i <= 2000000; i++){
            prime[i] = true;
        }
        for(int i = 2; i <= Math.sqrt(2000000); i++){
            if(prime[i] == true){
                for(int j = i * i ; j <= 2000000; j += i){
                    prime[j] = false;
                }
            }
        }
        long tong = 0;
        while(t != 0){
            int n = sc.nextInt();
            if(prime[n] == true){
                tong += n;
            }
            else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    while(n %i == 0){
                        tong += i;
                        n /= i;
                    }
                }
                if(n != 1) tong += n;
            }
            t--;
        }
        System.out.println(tong);
    }
}
