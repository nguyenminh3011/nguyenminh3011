import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;
    ThoiGian(){
    }
    ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public int getGiay(){
        return giay;
    }
    public int Time(){
        return (this.gio * 3600) + (this.phut * 60) + this.giay;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThoiGian> list = new ArrayList<>();
        while(t-- > 0){
            ThoiGian time = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
            list.add(time);
        }
        Collections.sort(list, new Comparator<ThoiGian>() {
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if(o1.Time() < o2.Time()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for(ThoiGian i : list){
            System.out.println(i.getGio() + " " + i.getPhut() + " " + i.getGiay());
        }
        sc.close();
    }
}
