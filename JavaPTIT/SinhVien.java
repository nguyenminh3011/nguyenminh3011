import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien{
        private String MaSV;
        private String name;
        private String lop;
        private String email;
        public SinhVien(String MaSV, String name, String lop, String email){
            this.MaSV = MaSV;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }
        public String getMaSV(){
            return MaSV;
        }
        private String chuanhoa(String s){
            String[] a = s.trim().toLowerCase().split("\\s+");
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
            }
            return res;
        }
        public String toString(){
            return MaSV + " " + chuanhoa(name) + lop + " " + email;
        }
        public static void main(String[] args) throws FileNotFoundException{
            File file = new File("SINHVIEN.in");
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<SinhVien> list = new ArrayList<>();
            while (t-- > 0){
                String MaSV = sc.nextLine();
                String name = sc.nextLine();
                String lop = sc.nextLine();
                String email = sc.nextLine();
                SinhVien sv = new SinhVien(MaSV, name, lop, email);
                list.add(sv);
            }    
            Collections.sort(list, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getMaSV().compareTo(o2.getMaSV());
                }
            });
            for(SinhVien sv : list){
                System.out.println(sv);
            }
            sc.close();
        }
    }

