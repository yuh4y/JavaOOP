package SapXepSinhVien;

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
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",tukhoa.toUpperCase());
            for (SinhVien sinhvien : danhsach){
                if (sinhvien.getNganh().equals(tukhoa)){
                    String temp = sinhvien.getMasv().substring(3,7);
                    if (temp.equals("DCCN") || temp.equals("DCAT")){
                        if (sinhvien.getLop().charAt(0) == 'E'){
                            continue;
                        }
                        else System.out.println(sinhvien);
                    }
                    else System.out.println(sinhvien);
                }
            }
        }
        scan.close();
    }
}
