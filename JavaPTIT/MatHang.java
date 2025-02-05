import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MatHang {
    private String ma;
    private String ten;
    private String donvi;
    private int mua;
    private int ban;
    public MatHang(String ma, String ten, String donvi, int mua, int ban){
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.mua = mua;
        this.ban = ban;
    }
    public int getLoiNhuan(){
        return (this.ban - this.mua);
    }
    public String toString(){
        return ma + " " + ten + " " + donvi + " " + mua + " " + ban + " " + getLoiNhuan();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> list = new ArrayList<>();
        int t = sc.nextInt();
        int k = 1;
        while(t-- > 0){
            sc.nextLine();
            MatHang x = new MatHang("MH0" + String.format("%02d", k), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextInt(), sc.nextInt());
            k++;
            list.add(x);
        }
        Collections.sort(list , new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                if(o1.getLoiNhuan() > o2.getLoiNhuan()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for(MatHang i : list){
            System.out.println(i);
        }
        sc.close();
    }
}
