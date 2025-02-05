import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code7001 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long sum = 0;
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            sum += n;
        }
        
        System.out.println(sum);
        sc.close();
    }
}
