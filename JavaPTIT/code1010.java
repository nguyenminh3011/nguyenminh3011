import java.util.Scanner;

public class code1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            int k = 0;
            long nsau = 0;
            int f = 0;
            while(n > 0){
                if(n %10 == 0 || n %10 == 8 || n %10 == 9){
                    k ++;
                }
                else if(n %10 == 1){
                    nsau = (long)nsau + (long)Math.pow(10,k);
                    k++;
                }
                else{
                    System.out.println("INVALID");
                    f++;
                    break;
                }
                n /= 10;
            }
            if(nsau != 0 && f == 0){
                System.out.println(nsau);
            }
            if(nsau == 0 && f == 0){
                System.out.println("INVALID");
            }
            t--;
        }
    }
}
