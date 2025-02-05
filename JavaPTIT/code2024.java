import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class code2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Comparator.reverseOrder());
            for(int i = 0; i < n; i++){
                int sum = 0;
                int j = i + 1;
                while(true){
                    
                }
            }
        }
    }
}
