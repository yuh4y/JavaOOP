package LietKeSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList <SinhVien> danhsach = new ArrayList<>();
        while(n-->0) {
            danhsach.add(new SinhVien(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()));
        }
        int t = Integer.parseInt(scan.nextLine());
        while (t-->0){
            String tukhoa = scan.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + tukhoa + ":");
            for (SinhVien sinhvien : danhsach){
                if (sinhvien.getLop().equals(tukhoa)){
                    System.out.println(sinhvien);
                }
            }
        }
        scan.close();
    }
    
}
