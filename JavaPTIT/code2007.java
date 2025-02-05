import java.util.Scanner;

public class code2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 1;
        while(t != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            System.out.printf("Test %d:\n",k);
            for(int i = 0; i < n; i++){
                if(a[i] > 0){
                    int dem = 1;
                    for(int j = i + 1; j < n; j++){
                    if(a[j] == a[i]){
                    a[j] = 0;
                    dem ++;
                    }
                }
                System.out.printf("%d xuat hien %d lan\n",a[i] , dem);
            }
            }
            t--;
            k++;
        }
    }
}
