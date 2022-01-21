package TInhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner sc = new Scanner (new File("KHACHHANG.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <Customer> danhsach = new ArrayList <>();
		for(int i=0; i<t; i++) {
			danhsach.add(new Customer(i+1, sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(danhsach);
		for(Customer khachhang : danhsach) {
			System.out.println(khachhang);
		}
		sc.close();
	}
}

/*
C:\java\JavaProjectPTIT\src\test.txt
*/