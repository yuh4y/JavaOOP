package DienTichHinhTronNgoaiTiep;

public class Point {
    private double x,y;
    private Point p;
    
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(Point p) {
        this.p = p;
    }
    
    public double distance(Point p1){
        return Math.sqrt((this.x - p1.x)*(this.x - p1.x) + (this.y - p1.y)*(this.y - p1.y));
    }
    
    public static double distance(Point p1 , Point p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
