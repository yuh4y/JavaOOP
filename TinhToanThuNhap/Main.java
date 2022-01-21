package TinhToanThuNhap;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList <NhanVien> danhsach = new ArrayList<>();
        for (int i=0; i<n; i++){
            danhsach.add(new NhanVien(i+1, scan.nextLine(),scan.nextLine(), Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine())));
        }
        /*String tukhoa = scan.nextLine();
        for (NhanVien nv : danhsach){
            if (nv.getChucvu().equals(tukhoa))
                System.out.println(nv);
        }*/
        Collections.sort(danhsach);
        for (NhanVien nv : danhsach){
            System.out.println(nv);
        }
        scan.close();
    }
}
