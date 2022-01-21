package GiaTre;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList <People> danhsach = new ArrayList <>();
		while (n-->0) {
			String[] tmp = sc.nextLine().split("\\s+");
			People pp = new People(tmp[0], tmp[1]);
			danhsach.add(pp);
		}
		Collections.sort(danhsach);
		System.out.println(danhsach.get(0));
		System.out.println(danhsach.get(danhsach.size()-1));
		sc.close();
	}
}
