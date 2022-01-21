package SapXepMatHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new File ("MATHANG.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <Product> danhsach = new ArrayList <>();
		for(int i=0; i<t; i++) {
			danhsach.add(new Product(i+1, sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
		}
		Collections.sort(danhsach);
		for(Product index : danhsach) {
			System.out.println(index);
		}
	}

}
/*
C:\java\JavaProjectPTIT\src\test.txt
* */
