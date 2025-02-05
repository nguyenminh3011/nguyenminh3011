import java.util.Scanner;

public class code2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int value, pos;
        for(int i = 0; i < n; i++){
            value = a[i];
            pos = i;
            while(pos > 0 && value < a[pos - 1]){
                a[pos] = a[pos - 1];
                pos = pos - 1;
            }
            a[pos] = value;
            System.out.printf("Buoc %d: ", i);
            for(int j = 0; j <= i; j++){
                System.out.print(a[j]);
                if(j < i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
