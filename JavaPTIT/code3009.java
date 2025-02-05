import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class code3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            String[] a = s1.split("\\s++");
            String[] b = s2.split("\\s++");
            ArrayList<String> arr = new ArrayList<>();
            for(int i = 0; i < a.length; i++){
                boolean check = true;
                for(int j = i + 1; j < a.length; j++){
                    if(a[i].compareTo(a[j]) == 0){
                        a[j] = "0";
                    }
                }
                for(int j = 0; j < b.length; j++){
                    if(a[i].compareTo(b[j]) == 0){
                        check = false;
                    }
                }
                if(check == true && a[i].equals("0") != true){
                    arr.add(a[i]);
                }
            }
            Collections.sort(arr);
            for(String x : arr){
                System.out.printf(x + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
