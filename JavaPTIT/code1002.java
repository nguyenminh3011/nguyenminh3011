import java.util.Scanner;

public class code1002{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0){
            if(b == 0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else{
            float m = -b/a;
            System.out.printf("%.2f \n",m);
        }

        
    }
}