import java.util.Scanner;

public class code3013 {
     static boolean isGreater(String a, String b){
        if(a.length() > b.length()){
            return true;
        }
        if(a.length() < b.length()){
            return false;
        }
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) > b.charAt(i)){
                return true;
            }
            if(a.charAt(i) < b.charAt(i)){
                return false;
            }
        }
        return false;
    }
     static String hieu(String a, String b){
        if(isGreater(a, b) != true){
            String tmp = a;
            a = b;
            b = tmp;
        }
        int lena = a.length(), lenb = b.length();
        StringBuilder bafter = new StringBuilder();
        while(lenb < lena){
            bafter.append('0');
            lenb ++;
        }
        b = bafter.toString() + b;
        StringBuilder result = new StringBuilder();

        int k = 0;
        for(int i = lena - 1; i >= 0; i--){
            int sub = (a.charAt(i) - '0') - (b.charAt(i) - '0') - k;
            if(sub < 0){
                sub += 10;
                k = 1;
            }
            else{
                k = 0;
            }
            result.append(sub);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String a = sc.nextLine().trim();
            String b = sc.nextLine().trim();
            int i = 0;
            while(i < a.length() - 1 && a.charAt(i) == '0'){
                i++;
            }
            a = a.substring(i);
            i = 0;
            while(i < b.length() - 1 && b.charAt(i) == '0'){
                i++;
            }
            b = b.substring(i);
            String result = hieu(a, b);
            System.out.println(result);
        }
        sc.close();
    }
}