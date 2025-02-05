import java.util.Scanner;

public class Point {
    private double x;
    private double y;
    Point(){
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public String toString(){
        return x + " " + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a = Point.distance(p1, p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            if(a + b <= c || a + c <= b || b + c <= a || (int)a == 0 || (int)b == 0 || (int)c == 0){
                System.out.print("INVALID");
            }
            else{
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("%.2f", area);
            }
            System.out.println();
        }
        sc.close();
    }
}
