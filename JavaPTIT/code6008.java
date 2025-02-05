import java.util.Scanner;

class MonHoc {
    private String ma;
    private String name;
    public MonHoc(String name, String ma) {
        this.ma = ma;
        this.name = name;
    }
    public String getMa(){
        return ma;
    }
    public String getName(){
        return name;
  }
}
class GiangVien {
    private String ma;
    private String name;
    public GiangVien(String ma, String name) {
        this.ma = ma;
        this.name = name;
    }
    public String getMa(){
        return ma;
    }
    public String getName(){
        return name;
    }
} 
class gio{
    private String gv;
    private String mh;
    private int gio;
    public gio(String gv, String mh, int gio) {
        this.gv = gv;
        this.mh = mh;
        this.gio = gio;
    }
    public void print(){
        System.out.println("Giang vien: " + gv);
        System.out.println(mh + gio);
        System.out.println("Tong: " + gio);
    }
    public String getGv(){
        return gv;
    }
}
public class code6008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somon = sc.nextInt();
        MonHoc[] monHoc = new MonHoc[somon];
        for (int i = 0; i < somon; i++) {
            String s = sc.nextLine();
            String ma = s.substring(0, 6);
            String name = s.substring(7).trim();
            monHoc[i] = new MonHoc(name, ma);
        }
        int sogv = sc.nextInt();
        GiangVien[] giangVien = new GiangVien[sogv];
        for (int i = 0; i < sogv; i++) {
            String s = sc.nextLine();
            String ma = s.substring(0, 3);
            String name = s.substring(4).trim();
            giangVien[i] = new GiangVien(ma, name);
        }
        int t = sc.nextInt();
        gio[] g = new gio[t];
        while(t-- > 0){
            String s = sc.nextLine();
            String gv = s.substring(0, 3);
            String mh = s.substring(5, 11);
            String gio = s.substring(12);
            for(int i = 0; i < sogv; i++){
                if(giangVien[i].getMa().equals(gv)){
                    gv = giangVien[i].getName();
                }
            }
            for(int i = 0; i < somon; i++){
                if(monHoc[i].getMa().equals(mh)){
                    mh = monHoc[i].getName();
                }
            }
            g[t] = new gio(gv, mh, Integer.parseInt(gio));
        }
        String s = sc.nextLine();
        for(int i = 0; i < sogv; i++){
            if(giangVien[i].getMa().equals(s)){
                s = giangVien[i].getName();
            }
        }
        for(int i = 0; i < t; i++){
            if(g[i].getGv().equals(s)){
                g[i].print();
            }
        }
        sc.close();
    }
}
