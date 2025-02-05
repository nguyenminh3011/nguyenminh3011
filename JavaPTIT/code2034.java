import java.util.Scanner;

public class code2034 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
    }
    int k = 0;
    boolean check = true;
    if(a[0] != 1){
        for(int i = 1; i < a[0]; i++){
            System.out.println(i);
            check = false;
        }
    }
    for(int i = a[0]; i <= a[n - 1]; i++){
        if(a[k] != i){
            System.out.println(i);
            check = false;
        }
        else{
            k++;
        }
    }
    if(check == true){
        System.out.println("Excellent!");
    }
}
}
