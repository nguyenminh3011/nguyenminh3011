import java.util.Scanner;

public class code3025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String S = sc.nextLine();
            int lenS = S.length();
            int dem = 0;
            for(int i = 0; i < lenS /2; i++){
                if(S.charAt(i) != (S.charAt(lenS - 1 - i))){
                    dem++;
                }   
            }
            if(dem == 1 || (dem == 0 && lenS % 2 != 0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
