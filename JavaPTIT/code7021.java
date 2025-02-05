import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code7021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("END")) break; 
            String[] words = line.toLowerCase().split("\\s++");
            for (int i = 0; i < words.length; i++) {
                if (!words[i].isEmpty()) { 
                    System.out.print(Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
