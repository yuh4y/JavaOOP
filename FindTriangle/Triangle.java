package FindTriangle;

public class Triangle {
    private Triangle(){}
    public static boolean checkTriangle(Point p1, Point p2, Point p3){
        double d1 = Point.distance(p1, p2);
        double d2 = Point.distance(p2, p3);
        double d3 = Point.distance(p1, p3);
        if (d1 + d2 > d3 && d2 + d3 > d1 && d1 + d3 > d2)
            return true;
        return false;
    }
    public static String findPerimeter(Point p1, Point p2, Point p3){
        if (Triangle.checkTriangle(p1,p2,p3) == true){
            Double res = Point.distance(p1, p2) + Point.distance(p3, p2) + Point.distance(p1, p3);
            return String.format("%.3f",res);
        }
        return "INVALID";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}