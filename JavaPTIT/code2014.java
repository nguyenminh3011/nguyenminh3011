import java.util.Scanner;

public class code2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int pos = 0;
            long phai = 0;
            long trai = 0;
            for(int i = 1; i < n; i++){
                trai += a[i];
            }
            for(int i = 1; i < n - 1; i++){
                phai += a[i - 1];
                trai -= a[i];
                if(phai - trai == 0){
                    pos = i;
                }
            }
            if(pos == 0) System.out.println("-1");
            else System.out.println(pos + 1);
            t--;
        }
    }
}
