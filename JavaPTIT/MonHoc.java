import java.io.*;
import java.util.*;

public class MonHoc {
    private String maMon;
    private String tenMon;
    private String hinhThucThi;

    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public int compareTo(MonHoc other) {
        return this.maMon.compareTo(other.maMon);
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThucThi;
    }

    public static void main(String[] args) {
        List<MonHoc> danhSachMonHoc = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("MONHOC.in"))) {
            int soMonHoc = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < soMonHoc; i++) {
                String maMon = br.readLine().trim();
                String tenMon = br.readLine().trim();
                String hinhThucThi = br.readLine().trim();

                MonHoc monHoc = new MonHoc(maMon, tenMon, hinhThucThi);
                danhSachMonHoc.add(monHoc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(danhSachMonHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc a, MonHoc b) {
                if(a.getMaMon().compareTo(b.getMaMon()) <= 0 ){
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        for (MonHoc monHoc : danhSachMonHoc) {
            System.out.println(monHoc);
        }
    }
}
