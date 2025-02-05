import java.util.Scanner;

public class code1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            boolean check = true;
            while(n > 0){
                if(n %10 != 0 && n %10 != 1 && n %10 != 2){
                    System.out.println("NO");
                    check = false;
                    break;
                }
                n/= 10;
            }
            if(check == true) System.out.println("YES");
            t--;
        }
    }
}
