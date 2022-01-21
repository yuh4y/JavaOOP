package DienTichHinhTronNgoaiTiep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            //String[] str = sc.nextLine().split("\\s+");
            Point p1 = new Point (sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point (sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point (sc.nextDouble(),sc.nextDouble());
            System.out.println(CircleArea.findArea(p1, p2, p3));
        }
        sc.close();
    }
}
/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/