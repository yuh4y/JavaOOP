package ThuNhapGiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        System.out.println(gv);
        sc.close();
    }
}
/* 
HP04
Tran Quoc Huy
1578000
*/