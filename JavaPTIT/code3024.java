import java.util.Scanner;
public class code3024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String S = sc.nextLine();
            int lenS = S.length();
            int chan = 0, le = 0;
            for(int i = 0; i < lenS; i++){
                if((S.charAt(i) - '0') % 2 == 0) chan++;
                else le++;
            }
            boolean check = true;
            for(int i = 0; i < lenS; i++){
                if(Character.isDigit(S.charAt(i)) == false){
                    System.out.println("INVALID");
                    check = false;
                    break;
                }
            }
            if(check){
                if(lenS %2 == 0 && chan > le){
                    System.out.println("YES");
                }
                else if(lenS %2 != 0 && le > chan) {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
