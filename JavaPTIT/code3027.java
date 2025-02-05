import java.util.Scanner;

public class code3027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int t = 1;
        while(t == 1){
            t = 0;
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == (s.charAt(i + 1))){
                    t = 1; 
                    s = s.substring(0, i) + s.substring(i + 2);
                }
            }
        }
        if(s.length() == 0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
        sc.close();
    }
}
