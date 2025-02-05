import java.util.Scanner;

public class code2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        boolean[] used = new boolean[n];
        for(int i = 0; i < n; i++){
            used[i] = true;
        }
        int dem = n;
        boolean check = true;
        while(check == true){
            check = false;
            for(int i = 0; i < n - 1; i++){
                if(used[i]){
                    int j = i + 1;
                    while(j < n && !used[j]){
                        j++;
                    }
                    if(j < n && (a[i] + a[j]) %2 == 0){
                        used[i] = false;
                        used[j] = false;
                        dem -= 2;
                        check = true;
                    }
                }
            }
        }
        System.out.println(dem);
    }
}
