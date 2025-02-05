import java.util.Scanner;

public class code1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for(int i = 1; i <= n; i++){
            int j = 1;
            long gt = 1;
            while(j <= i){
                gt *= j;
                j ++;
            }
            tong += gt;
        }
        System.out.println(tong);
    }
}
