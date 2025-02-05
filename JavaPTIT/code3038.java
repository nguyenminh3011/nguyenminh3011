import java.util.Scanner;

public class code3038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int dem = 0;
        int[] a = new int[256];
        for(char c : s.toCharArray()){
            a[c]++;
        }
        for(int i = 0; i < 256; i++){
            if(a[i] != 0){
                dem++;
            }
        }
        System.out.println(dem);
        sc.close();
    }
}
