import java.util.Scanner;

public class code2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = 1;
        for(int i = 0; i < n - 1; i++){
            boolean check = false;
            for(int j = 0; j < n - 1 - i; j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = true;
                }
            }
            if(check == true){
                System.out.printf("Buoc %d: ", k);
                for(int j = 0; j < n; j++){
                    System.out.print(a[j]);
                    if(j < n - 1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
                k++;
            }
            else break;
        }
    }
}
