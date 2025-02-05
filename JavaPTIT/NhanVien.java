import java.util.Scanner;

public class NhanVien {
    private String id;
    private String name;
    private String sex;
    private String birth;
    private String address;
    private String tax;
    private String date;
    NhanVien(){
    }
    NhanVien(String id, String name, String sex, String birth, String address, String tax, String date){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }
    public String toString(){
        return id + " " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + date;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien("00001", sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
        System.out.println(x);
        sc.close();
    }
}
