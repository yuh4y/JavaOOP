package FindTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            Point p1 = new Point(scan.nextDouble(), scan.nextDouble());
            Point p2 = new Point(scan.nextDouble(), scan.nextDouble());
            Point p3 = new Point(scan.nextDouble(), scan.nextDouble());
            System.out.println(Triangle.findPerimeter(p1, p2, p3));
        }
        scan.close();
    }
}
/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/