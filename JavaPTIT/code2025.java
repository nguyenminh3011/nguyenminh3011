import java.util.Scanner;

public class code2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int b4 = sc.nextInt();
        int minX = Math.min(a1,b1);
        int minY = Math.min(a2,b2);
        int maxX = Math.max(a3, b3);
        int maxY = Math.max(a4, b4);
        int canh = Math.max(maxX - minX, maxY - minY);
        System.out.println((int)Math.pow(canh,2));
    }
}
