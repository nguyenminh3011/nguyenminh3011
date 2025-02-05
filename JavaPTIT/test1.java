import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Đọc bỏ dòng trống sau khi đọc số lần test
        
        while (t > 0) {
            String s = sc.nextLine().trim();  // Đọc chuỗi và loại bỏ khoảng trắng
            boolean check = true;
            int len = s.length();
            
            // Kiểm tra tính đối xứng và số chẵn
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - 1 - i)) {
                    check = false;
                    break;
                }
                if ((s.charAt(i) - '0') % 2 != 0) {
                    check = false;
                    break;
                }
            }

            // Nếu độ dài lẻ, kiểm tra ký tự giữa
            if (len % 2 != 0 && (s.charAt(len / 2) - '0') % 2 != 0) {
                check = false;
            }

            // In kết quả
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;  // Giảm số lần lặp
        }

        sc.close();
    }
}