import java.util.Scanner;

class Point3D{
    private int x;
    private int y;
    private int z;
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D vector(Point3D other){
        return new Point3D(other.x - this.x, other.y - this.y, other.z - this.z);
    }
    public Point3D cohuong(Point3D other){
        return new Point3D(this.y * other.z - other.y * this.z, other.x * this.z - this.x * other.z, this.x * other.y - other.x * this.y);
    }
    public int vohuong(Point3D other){
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D v12 = p1.vector(p2);
        Point3D v13 = p1.vector(p3);
        Point3D v14 = p1.vector(p4);
        Point3D n1 = v12.cohuong(v13);
        int tich = n1.vohuong(v14);
        if(tich == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
public class code4011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            
            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
