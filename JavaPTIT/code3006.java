import java.util.Scanner;

public class code3006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t != 0){
            boolean check = true;
            String s = sc.nextLine();
            int len = s.length();
            for(int i = 0; i < len/ 2; i++){
                if(s.charAt(i) != s.charAt(len - 1 - i)){
                    check = false;
                    break;
                }
                if((s.charAt(i) - '0') %2 != 0){
                    check = false;
                    break;
                }
            }
            if(len %2 != 0 && (s.charAt(len/2) - '0') %2 != 0){
                check = false;
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
