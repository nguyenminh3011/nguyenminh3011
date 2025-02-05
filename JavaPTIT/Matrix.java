import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    private int[][] a;
    int n, m;
    public Matrix(int n, int m, int[][] a){
        this.n = n;
        this.m = m;
        this.a = a;
    }
    public void print(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");  
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(("MATRIX.in")));
        int t = sc.nextInt();
        List<Matrix> list1 = new ArrayList<>();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int[][] a = new int[n][m];
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    a[j][k] = sc.nextInt();
                    if(k == i - 1){
                        list.add(a[j][k]);
                    }
                }
            }
            Collections.sort(list);
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    if(k == i - 1){
                        a[j][k] = list.get(j);
                    }
                }
            }
            Matrix mx = new Matrix(n, m, a);
            list1.add(mx);
        }
        for(Matrix i : list1){
            i.print();
        }
        sc.close();
    }
}
