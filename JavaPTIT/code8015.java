import java.util.Arrays;
import java.util.Scanner;

public class code8015 {
    public static int lower_bound(long[] a, int l, int r, long value){
        int ans = r + 1;
        while(l <= r){
            int mid = (r + l) / 2;
            if(a[mid] == value){
                ans = mid;
                r = mid - 1;
            }
            else if(a[mid] <= value){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
    }
    public static int upper_bound(long[] a, int l, int r, long value){
        int ans = r + 1;
        while(l <= r){
            int mid = (r + l) / 2;
            if(a[mid] == value){
                ans = mid;
                l = mid + 1;
            }
            else if(a[mid] <= value){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long ans = 0;
            for(int i = 0; i < n - 1; i++){
                int up = upper_bound(a, i + 1, n - 1, k - a[i]);
                int low = lower_bound(a, i + 1, n - 1, k - a[i]);
                if(low <= n - 1){
                    ans += up - low + 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
