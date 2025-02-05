import java.util.Scanner;

public class code2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        boolean check = true;
        int k = 1;
        for(int i = 0; i < n; i++){
            check = true;
            int tmp = a[i];
            for(int j = i + 1; j < n ; j++){
                if(a[j] <= tmp){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                    check = false;
                }
            }
            if(check == false){
                System.out.printf("Buoc %d: ",k);
                for(int x : a) System.out.printf(x +" ");
                System.out.println();
                k++;
            }
        }
    }
}
