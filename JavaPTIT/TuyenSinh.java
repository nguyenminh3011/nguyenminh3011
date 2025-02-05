import java.util.Scanner;

public class TuyenSinh {
    private String MaTS;
    private String Name;
    private double toan , ly , hoa;
    public TuyenSinh(){
    }
    public TuyenSinh(String MaTS, String Name, double toan, double ly, double hoa){
        this.MaTS = MaTS;
        this.Name = Name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public String getMaTS(){
        return MaTS;
    }
    public String getTong(){
        double tong = toan * 2 + ly + hoa;
        if(tong == (int)tong){
            return (int)tong + "";
        }
        else{
            return tong + "";
        }
    }
    public void xet(){
        double tong = toan * 2 + ly + hoa;
        char khuvuc = MaTS.charAt(2);
        if(tong == (int)tong){
            tong = (int)tong;
        }
        if(khuvuc == '1'){
            if(tong + 0.5 >= 24){
                System.out.println(MaTS + " " + Name + " " + "0,5 " + this.getTong() + " " + "TRUNG TUYEN");
            }
            else{
                System.out.println(MaTS + " " + Name + " " + "0,5 " + this.getTong()+ " " + "TRUOT");
            }
        }
        if(khuvuc == '2'){
            if(tong + 1>= 24){
                System.out.println(MaTS + " " + Name + " " + "1 " + this.getTong()+ " " + "TRUNG TUYEN");
            }
            else{
                System.out.println(MaTS + " " + Name + " " + "1 " + this.getTong() + " " + "TRUOT");
            }
        }
        if(khuvuc == '3'){
            if(tong + 2.5>= 24){
                System.out.println(MaTS + " " + Name + " " + "2,5 " + this.getTong() + " " + "TRUNG TUYEN");
            }
            else{
                System.out.println(MaTS + " " + Name + " " + "2,5 " + this.getTong() + " " + "TRUOT");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        ts.xet();
        sc.close();
    }
}
