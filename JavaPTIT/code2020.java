import java.util.Scanner;

public class code2020 {
    static int ok = 1;
    static void ktao(int n, int[] a){
        for(int i = 1; i <= n; i++){
            a[i] = i;
        }
    }
    static boolean check(int n, int[] a){
        for(int i = 1; i <= n - 1; i++){
            if(Math.abs(a[i] - a[i + 1]) == 1){
                return false;
            }
        }
        return true;
    }
    static void sinh(int n, int[] a){
        int i = n - 1;
        while(i > 0 && a[i] > a[i + 1]){
            i--;
        }
        if(i == 0){
            ok = 0;
        }
        else{
            int j = n;
            while(a[j] < a[i]){
                j--;
            }
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            int l = i + 1, r = n;
            while(l < r){
                tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
                l++; r--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            ok = 1;
            ktao(n, a);
            while(ok == 1){
                if(check(n, a)){
                    for(int i = 1; i <= n; i++){
                        System.out.print(a[i]);
                    }
                    System.out.println();
                }
            sinh(n, a);
            }
        }
        sc.close();
    }
}
