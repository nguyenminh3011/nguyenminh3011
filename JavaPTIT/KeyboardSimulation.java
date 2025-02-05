import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class KeyboardSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Sử dụng LinkedList để lưu trữ các ký tự
        LinkedList<Character> text = new LinkedList<>();
        ListIterator<Character> cursor = text.listIterator(); // Con trỏ để di chuyển trong chuỗi

        for (char c : input.toCharArray()) {
            if (c == '<') {
                // Di chuyển con trỏ sang trái nếu có thể
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
            } else if (c == '>') {
                // Di chuyển con trỏ sang phải nếu có thể
                if (cursor.hasNext()) {
                    cursor.next();
                }
            } else if (c == '-') {
                // Xóa ký tự trước con trỏ nếu có thể
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            } else {
                // Thêm ký tự tại vị trí con trỏ
                cursor.add(c);
            }
        }

        // In kết quả
        StringBuilder result = new StringBuilder();
        for (char ch : text) {
            result.append(ch);
        }
        System.out.println(result);
    }
}
