import java.util.Scanner;

public class code3026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String X = sc.nextLine();
            String Y = sc.nextLine();
            int lenX = X.length();
            int lenY = Y.length();
            if(lenX > lenY){
                System.out.println(lenX);
            }
            else if(lenX < lenY){
                System.out.println(lenY);
            }
            else{
                while(X.contains(Y) && lenY > 0){
                    Y = Y.substring(0, lenY - 1);
                    lenY --;
                }
                if(lenY == 0){
                    System.out.println("-1");
                }
                else{
                    System.out.println(lenY);
                }
            }
        }
        sc.close();
    }
}
