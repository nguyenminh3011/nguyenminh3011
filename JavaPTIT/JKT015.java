import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        String s = sc.nextLine();
        LinkedList<Character> ls = new LinkedList<>();
        ListIterator<Character> it = ls.listIterator();
        for(char c : s.toCharArray()){
            if(c == '<'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }
            else if(c == '>'){
                if(it.hasNext()){
                    it.next();
                }
            }
            else if(c == '-'){
                if(it.hasPrevious()){
                    it.previous();
                    it.remove();
                }
            }
            else{
                it.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : ls){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
