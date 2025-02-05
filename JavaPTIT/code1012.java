import java.util.Scanner;

public class code1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int dem = 0;
            int k = (int)Math.sqrt(n);
            for(int i = 1; i < Math.sqrt(n); i++){
                if(n %i == 0){
                    if(i %2 == 0){
                        dem++;
                    }
                    if((n/i) %2 == 0){
                        dem++;
                    }
                }
            }
            if(Math.pow(k,2) == n && k %2 == 0){
                dem ++;
            }
            System.out.println(dem);
            t--;
        }
    }
}
