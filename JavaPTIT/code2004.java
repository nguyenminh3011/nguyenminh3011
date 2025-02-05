import java.util.Scanner;

public class code2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean check = true;
            for(int i = 0; i <= n/2; i++){
                if(a[i] != a[n - 1 - i]){
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check == true) System.out.println("YES");
            t--;
        }
    }
}
