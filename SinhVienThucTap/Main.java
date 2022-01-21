package SinhVienThucTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        ArrayList <DoanhNghiep> danhsach = new ArrayList<DoanhNghiep>();
        while (t--> 0){
            danhsach.add(new DoanhNghiep(scan.nextLine(), scan.nextLine(), Integer.parseInt(scan.nextLine())));
        }
        int n = scan.nextInt();
        while (n-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            Collections.sort(danhsach);
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", Math.min(a, b), Math.max(a, b));
            for (DoanhNghiep sinhvien : danhsach){
                if (sinhvien.getSoSV() <= Math.max(a,b) && sinhvien.getSoSV() >= Math.min(a, b))
                System.out.println(sinhvien);
            }
        }
    }
}
