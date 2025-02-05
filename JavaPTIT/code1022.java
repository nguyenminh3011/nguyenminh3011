import java.util.Scanner;

public class code1022 {
    public static long[] a = new long[93];
    static{
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i < 93; i++){
            a[i] = a[i - 2] + a[i - 1];
    }
}
    public static long fibo(int n, long k){
        if(n == 1) return 0;
        else if(n == 2) return 1;
        else{
            if(k <= a[n - 2]){
                return fibo(n - 2, k);
            }
            else{
                return fibo(n - 1, k - a[n - 2]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fibo(n, k));
            t--;
        }
    }
}
