import java.util.Scanner;

public class code2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int min = 0;
        int k = 1;
        for(int i = 0; i < n - 1; i++){
            min = i;
            boolean check = false;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min != i){
                int tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
                check = true;
            }
            if(check || i == n - 2){
                System.out.printf("Buoc %d: ", k);
                for (int x = 0; x < n; x++) {
                    System.out.print(a[x]);
                    if (x < n - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                k++;
            }
            if(!check) break;
        }
    }
}
