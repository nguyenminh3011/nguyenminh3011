import java.util.Scanner;

public class code2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(a[j] == a[i]){
                    a[i] = 0;
                    break;
                }
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 0; j < i; j++){
                if(b[j] == b[i]){
                    b[i] = 0;
                    break;
                }
            }
        }
        int[] check = new int[1001];
        for(int i = 0; i < n; i++){
            if(a[i] > 0){
                check[a[i]] = 1;
            }
        }
        for(int i = 0; i < m; i++){
            if(b[i] > 0) check[b[i]] = 1;
        }
        for(int i = 1; i <= 1000; i++){
            if(check[i] != 0){
                System.out.printf(i + " ");
            }
        }
    }
}
