/* Author: NgTienHungg */

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Pair {

    public int t;
    public int d;

    public Pair(int t, int d){
        this.t = t;
        this.d = d;
    }
}

public class J02009_XepHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Pair> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            Pair x = new Pair(sc.nextInt(), sc.nextInt());
            v.add(x);
        }
        Collections.sort(v, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                return a.t < b.t ? -1 : 1;
            }
        });
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (s < v.get(i).t) {
                s = v.get(i).t;
            }
            s += v.get(i).d;
        }
        System.out.println(s);
        sc.close();
    }
}