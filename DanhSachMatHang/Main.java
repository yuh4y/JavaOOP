package DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <MatHang> danhsach = new ArrayList <>();
		for (int i=0; i<t; i++) {
			danhsach.add(new MatHang(i+1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(danhsach);
		for (MatHang sv : danhsach)
			System.out.println(sv);
		sc.close();
	}

}
/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/