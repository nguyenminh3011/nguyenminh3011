import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Thisinh {
    public static int stt = 1;
    private String name, dantoc;
    private int khuvuc;
    private double diem;
    private String STT;
    public Thisinh(String name, double diem, String dantoc, int khuvuc){
        this.name = name;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        this.diem = diem;
        this.STT = "TS" + String.format("%02d", stt++);
    }
    public String chuanhoa(String s){
        String[] a = s.trim().toLowerCase().split("\\s++");
        String res = "";
        for(String i : a){
            res += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public double tinhDiem(){
        double res = diem;
        if(dantoc.equals("Kinh") == false){
            res += 1.5;
        }
        if(khuvuc == 1){
            res += 1.5;
        }
        else if(khuvuc == 2){
            res += 1;
        }
        if(res >= 30){
            res = 30;
        }
        return res;
    }
    public String getSTT(){
        return STT;
    }
    public String trangThai(){
        if(tinhDiem() >= 20.5){
            return "Do";
        }
        return "Truot";
    }
    public String toString(){
        return STT + " " + chuanhoa(name) + String.format("%.1f", tinhDiem()) + " " + trangThai();
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Thisinh> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            String dantoc = sc.nextLine();
            int khuvuc = Integer.parseInt(sc.nextLine());
            Thisinh ts = new Thisinh(name, diem, dantoc, khuvuc);
            list.add(ts);
        }
        Collections.sort(list, new Comparator<Thisinh>() {
            @Override
            public int compare(Thisinh o1, Thisinh o2) {
                if(o1.tinhDiem() < o2.tinhDiem()){
                    return 1;
                }
                else if(o1.tinhDiem() > o2.tinhDiem()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        for(Thisinh i : list){
            System.out.println(i);
        }
        sc.close();
    }
}
