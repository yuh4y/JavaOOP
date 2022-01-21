package dangkyhinhthucgiangday;

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
		ArrayList <MonHoc> dsmonhoc = new ArrayList <>();
		while (t-->0) {
			dsmonhoc.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(dsmonhoc);
		for(MonHoc mon : dsmonhoc) {
			System.out.println(mon);
		}
	}

}
