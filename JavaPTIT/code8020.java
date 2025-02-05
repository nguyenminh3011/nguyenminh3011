import java.util.Scanner;
import java.util.Stack;

public class code8020 {
    public static int check(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                if(st.empty() || st.peek() != '('){
                    return 0;
                }
                st.pop();
            }
            else if(s.charAt(i) == ']'){
                if(st.empty() || st.peek() != '['){
                    return 0;
                }
                st.pop();
            }
            else if(s.charAt(i) == '}'){
                if(st.empty() || st.peek() != '{'){
                    return 0;
                }
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int kq = check(s);
            if(kq == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
