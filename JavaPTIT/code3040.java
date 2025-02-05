import java.util.Scanner;

public class code3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            StringBuilder s = new StringBuilder(sc.nextLine());
            s.deleteCharAt(8);
            s.toString();
            boolean th1 = false;
            boolean th2 = false;
            boolean th3 = false;
            boolean th4 = false;
            int dem = 0;
            for(int i = 5; i <= 8; i++){
                if((s.charAt(i) - '0') < ((s.charAt(i + 1)) - '0')){
                    dem ++;
                }
            }
            if(dem == 4){
                th1 = true;
            }
            dem = 0;
            for(int i = 5; i <= 8; i++){
                if(s.charAt(i) == s.charAt(i + 1)){
                    dem++;
                }
            }
            if(dem == 4){
                th2 = true;
            }
            if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(8) == s.charAt(9)){
                th3 = true;
            }
            dem = 0;
            for(int i = 5; i <= 9; i++){
                if(s.charAt(i) == '6' || s.charAt(i) == '8'){
                    dem++;
                }
            }
            if(dem == 5){
                th4 = true;
            }
            if(th1 || th2 || th3 || th4){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
