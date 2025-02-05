import java.util.Scanner;

public class code3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n != 0){
            String s = sc.nextLine().trim();
            s = s.toLowerCase();
            String[] a = s.split("\\s++");
            a[0] = a[0].toUpperCase();
            for(int i = 1; i < a.length; i++){
                String res = "";
                for(int j = 0; j < a[i].length(); j++){
                    if(j == 0) res  += Character.toUpperCase(a[i].charAt(j));
                    else res += a[i].charAt(j);
                }
                if(i < a.length - 1 && i > 0) System.out.printf(res + " ");
                else if(i == a.length - 1) System.out.printf(res + ", ");
            }
            System.out.println(a[0]);
            n--;
        }
    }
}
