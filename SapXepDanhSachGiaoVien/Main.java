package SapXepDanhSachGiaoVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <GiaoVien> danhsach = new ArrayList<GiaoVien>();
        for(int i=0; i<t; i++){
            danhsach.add (new GiaoVien (i+1,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(danhsach);
        for(GiaoVien gv : danhsach){
            System.out.println(gv);
        }
        sc.close();
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/