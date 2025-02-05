import java.util.Scanner;

public class code2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        if(k > 9 * n || (k == 0 && n > 1)){
            System.out.println("-1 -1");
        }
        else if(n == 1 && k == 0){
            System.out.println("0 0");
        }
        else{
            int sum = k; 
            for(int i = 0; i < n; i++){
                if(sum >= 9){
                    sb.append("9");
                    sum -= 9;
                }
                else if(i == n - 1){
                    sb.append(sum);
                    sum = 0;
                }
                else{
                    int x = n - i - 1;
                    sb.append(sum);
                    for(int j = 1; j <= x; j++){
                        sb.append("0");
                    }
                    break;
                }
            }
            System.out.print(sb + " ");
            StringBuilder sb1 = new StringBuilder(sb.reverse());
            if(sb1.charAt(0) == '0'){
                sb1.setCharAt(0, '1');
                for(int i = 1; i < sb1.length(); i++){
                    if(sb1.charAt(i) != '0'){
                        sb1.setCharAt(i, (char)(sb1.charAt(i) - 1));
                        break;
                    }
                }
            }
            System.out.println(sb1.toString());
        }
        sc.close();
    }
}
