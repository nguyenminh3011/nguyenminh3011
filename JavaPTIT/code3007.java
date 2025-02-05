import java.util.Scanner;

public class code3007 {
    public static boolean kiemtra(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            String s = sc.nextLine();
            boolean check = true;
                for(int i = 0; i < s.length()/2; i++){
                    if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                        check = false;
                        break;
                    }
                }
            if(check == true && kiemtra(s)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
