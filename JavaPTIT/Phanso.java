import java.util.Scanner;

public class Phanso {
    private long tu;
    private long mau;
    Phanso(){
    }
    Phanso(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public static long gcd(long a, long b){
        if(a == 0){
            return b;
        }
        else{
            return gcd(b % a, a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phanso p = new Phanso(sc.nextLong(), sc.nextLong());
        Phanso q = new Phanso(sc.nextLong(), sc.nextLong());
        long Mauso = (p.getMau() * q.getMau()) / gcd(p.getMau(), q.getMau());
        long Tuso = (p.getTu() * (Mauso / p.getMau())) + (q.getTu() * (Mauso / q.getMau()));
        System.out.println(Tuso / gcd(Tuso, Mauso) + "/" + Mauso / gcd(Tuso, Mauso));
        sc.close();
    }
}
