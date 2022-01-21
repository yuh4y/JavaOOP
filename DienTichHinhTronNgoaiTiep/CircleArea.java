package DienTichHinhTronNgoaiTiep;

public class CircleArea {
    /*public static boolean checkTriangle(Point p1, Point p2, Point p3){
        double d1 = Point.distance(p1, p2);
        double d2 = Point.distance(p2, p3);
        double d3 = Point.distance(p1, p3);
        if (d1 + d2 > d3 && d2 + d3 > d1 && d1 + d3 > d2)
            return true;
        return false;
    }*/
    public static String findArea(Point p1, Point p2, Point p3){
        double d1 = Point.distance(p1, p2);
        double d2 = Point.distance(p2, p3);
        double d3 = Point.distance(p1, p3);
        if (d1 + d2 > d3 && d2 + d3 > d1 && d1 + d3 > d2){
            Double p = (d1 + d2 + d3)/2;
            Double TriArea = Math.sqrt(p * (p-d1) * (p-d2) * (p-d3));
            Double R = d1*d2*d3/4/TriArea;
            Double CcArea = Math.PI * R * R;
            return String.format("%.3f", CcArea);
        }
        return "INVALID";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
