import java.util.Scanner;
import java.util.Stack;

public class code8021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int maxLen = max(s);
            System.out.println(maxLen);
        }
        sc.close();
    }
    public static int max(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }
}
