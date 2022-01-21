package TinhtoanPhanSo;

import java.util.Scanner;

public class Mainps {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while (t-->0){
            phanSo p1 = new phanSo(scan.nextLong(), scan.nextLong());
            phanSo p2 = new phanSo(scan.nextLong(), scan.nextLong());
            phanSo c = phanSo.TinhTich(phanSo.TinhTong(p1, p2),phanSo.TinhTong(p1, p2));
            System.out.print(c);
            System.out.print(" ");
            phanSo d = phanSo.TinhTich(p1, p2);
            System.out.println(phanSo.TinhTich(d,c));
        }
        scan.close();
    }
}
