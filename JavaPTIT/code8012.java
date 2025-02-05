import java.util.Scanner;

public class code8012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        int[] a = new int[t + 1];
        while(t-- > 1){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x] ++;
            a[y] ++;
        }
        for(int i = 1; i <= n; i++){
            if(a[i] != 1 && a[i] != n - 1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}
