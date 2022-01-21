package DanhSachMonThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new File ("MONHOC.in"));
		ArrayList <MonThi> dsmon = new ArrayList <>();
		int t = Integer.parseInt(sc.nextLine());
		while (t-->0) {
			dsmon.add(new MonThi (sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(dsmon);
		for (MonThi mon : dsmon) {
			System.out.println(mon);
		}
	
	}

}
