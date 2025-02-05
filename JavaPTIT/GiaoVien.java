import java.util.Scanner;

public class GiaoVien {
    private String ma;
    private String ten;
    private int luongcb;
    private int luong = 0;
    private int num;
    GiaoVien(String ma, String ten, int luongcb){
        this.ma = ma;
        this.ten = ten;
        this.luongcb = luongcb;
        this.num = Integer.parseInt(this.ma.substring(2, 4));
    }
    public String getphucap(){
        if(this.ma.substring(0, 2).equals("HT")){
            return "2000000";
        }
        else if(this.ma.substring(0, 2).equals("HP")){
            return "900000";
        }
        else if(this.ma.substring(0, 2) .equals("GV")){
            return "500000";
        }
        return "0";
    }
    public int tinhLuong(){
        if(this.ma.substring(0, 2).equals("HT")){
            luong += 2000000;
        }
        else if(this.ma.substring(0, 2).equals("HP")){
            luong += 900000;
        }
        else if(this.ma.substring(0, 2) .equals("GV")){
            luong += 500000;
        }
        luong += this.luongcb * num ;
        return luong;
    }
    public String toString(){
        return ma + " " + ten + " " + num + " " + getphucap()+  " " + tinhLuong();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextInt());
        System.out.println(x.toString());
        sc.close();
    }
}
