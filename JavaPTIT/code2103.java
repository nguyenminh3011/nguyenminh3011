import java.util.Scanner;

public class code2103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 1;
        while(t-- > 0){
            int n = sc.nextInt();;
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] b = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    b[i][j] = a[j][i];
                }
            }
            System.out.printf("Test %d:\n", k);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int tong = 0;
                    for(int dem = 0; dem < m; dem++){
                        tong += a[i][dem] * b[dem][j];
                    }
                    System.out.print(tong + " ");
                }
                System.out.println();
            }
            k++;
        }
        sc.close();
    }
}
