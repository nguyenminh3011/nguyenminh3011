import java.util.Scanner;

public class code3021 {
    public static String solve(char s){
            switch (s) {
                case 'a' : case 'b' : case 'c' :
                    return "2";
                case 'd' : case 'e' : case 'f' :
                    return "3";
                case 'g' : case 'h' : case 'i' :
                    return "4";
                case 'j' : case 'k' : case 'l' :
                    return "5";
                case 'm' : case 'n' : case 'o' :
                    return "6";
                case 'p' : case 'q' : case 'r' : case 's' :
                    return "7";
                case 't' : case 'u' : case 'v' :
                    return "8";
                case 'w' : case 'x' : case 'y' : case 'z' :
                    return "9";
                default:
                    return "";
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                sb.append(solve(s.charAt(i)));
            }
            s = sb.toString();
            boolean check = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
        }
        sc.close();
    }
}
