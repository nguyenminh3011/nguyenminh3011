import java.util.Scanner;

public class code1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 1;
        while(t != 0){
            long n = sc.nextLong();
            System.out.printf("Test %d: ", k);
            for(int i = 2; i <= Math.sqrt(n); i++){
                int dem = 0;
                if(n %i == 0){
                    while(n %i == 0){
                        dem ++;
                        n /= i;
                    }
                    System.out.printf("%d(%d) ", i, dem);
                }
            }
            if(n > 1) System.out.printf("%d(1) \n", n);
            t--;
            k++;
            System.out.println("\n");
        }
    }
}
