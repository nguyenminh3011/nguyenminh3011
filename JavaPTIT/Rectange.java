import java.util.Scanner;

public class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange(){
        width = 1;
        height = 1;
        color = "";
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public double setWidth(double width){
        return this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public double setHeight(double height){
        return this.height = height;
    }
    public String getColor(){
        return color;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public void chuanhoa(){
        StringBuilder sb = new StringBuilder(color.trim().toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        color = sb.toString();
    }
    public double findArea(){
        return width * height;
    }
    public double findPerimeter(){
        return (width + height) * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange r = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.nextLine());
        if(r.getWidth() == (int)r.getWidth() && r.getHeight() == (int)r.getHeight() && r.getWidth() > 0 && r.getHeight() > 0){
            r.chuanhoa();
            double area = r.findArea();
            double perimeter = r.findPerimeter();
            int dientich = (int) area;
            int chuvi = (int) perimeter;
            System.out.println(chuvi + " " + dientich + " " + r.getColor());
        }
        else{
            System.out.println("INVALID");
        }
        sc.close();
    }
}
