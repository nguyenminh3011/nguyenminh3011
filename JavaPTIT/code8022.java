import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class code8022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean check = false;
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i = 0; i < n; i++){
                ls.add(sc.nextInt());
            }
            int max = Collections.max(ls);
            for(int i = 0; i < n; i++){
                if(ls.get(i) == max || i == n - 1){
                    System.out.print("-1 ");
                }
                else{
                    for(int j = i + 1; j < n; j++){
                        check = false;
                        if(ls.get(j) > ls.get(i)){
                            System.out.print(ls.get(j) + " ");
                            check = true;
                            break;
                        }
                    }
                    if(check == false){
                        System.out.print("-1 ");
                    }
                }
            }
            System.out.println();            
        }
        sc.close();
    }
}
