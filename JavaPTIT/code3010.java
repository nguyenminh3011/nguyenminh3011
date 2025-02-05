import java.util.ArrayList;
import java.util.Scanner;

public class code3010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        while(t > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s++");      
            String res = "";
            int leng = a.length;
            res += a[leng - 1];
            for(int i = 0; i < leng - 1; i++){
                res += a[i].charAt(0);
            }
            int k = arr.size();
            int dem = 2;
            while(k > 0){
                for(String x : arr){
                    if(res.equals(x) == true){
                        if(dem >= 3){
                            res = res.substring(0, res.length() - 1);
                            res += String.valueOf(dem);
                            dem ++;
                        }
                        else{
                            res += String.valueOf(dem);
                            dem ++;
                        }
                    }
                }
                k--;
            }
            arr.add(res);
            System.out.printf(res + "@ptit.edu.vn");
            System.out.println();   
            t--;
        }
        sc.close();
    }
}
