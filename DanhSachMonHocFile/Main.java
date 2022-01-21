package DanhSachMonHocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File fin = new File ("MONHOC.in");
		Scanner sc = new Scanner (fin);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <MonHoc> danhsach = new ArrayList <>();
		while (t-->0) {
			danhsach.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(danhsach);
		for (MonHoc mh : danhsach)
			System.out.println(mh);
		sc.close();
	}

}
