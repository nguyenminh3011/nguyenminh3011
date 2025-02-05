import java.util.Scanner;

public class code3011 {
    public static long gcd(long a, long b){
        if(a == 0){
            return b;
        }
        else{
            return gcd(b %a, a);
        }
    }
    public static long mod(long a, String b){
        long mod = 0;
        for(int i = 0; i < b.length(); i++){
            mod = (mod * 10 + (b.charAt(i) - '0')) % a;
        }
        return mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long a = sc.nextLong();
            sc.nextLine();
            String b = sc.nextLine();
            long mod = mod(a, b);
            System.out.println(gcd(a, mod));
            t--;
        }
        sc.close();
    }
}
