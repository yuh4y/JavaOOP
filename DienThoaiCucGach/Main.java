package DienThoaiCucGach;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while(t-->0){
            String message = scan.nextLine().toLowerCase();
            DienThoai dt = new DienThoai(message);
            System.out.println(dt);
        }
        scan.close();
    }
}
