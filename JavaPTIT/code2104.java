import java.util.Scanner;

public class code2104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3];
        int k = 1;
        int tong = 0;
        while(k <= n){
            int dem = 0;
            for(int i = 0; i < 3; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < 3; i++){
                if(a[i] == 1){
                    dem++;
                }
            }
            if(dem >= 2){
                tong++;
            }
            k++;
        }
        System.out.println(tong);
        sc.close();
    }
}
