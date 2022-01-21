package BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList <HocSinh> danhsach = new ArrayList<>();
        for (int i=0; i<n; i++){
            danhsach.add(new HocSinh(i+1, scan.nextLine(), scan.nextLine().split("\\s+")));
        }
        Collections.sort(danhsach);
        danhsach.forEach(System.out::println);
        scan.close();
    }
}
