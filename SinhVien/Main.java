package SinhVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws  ParseException {
		Scanner scan = new Scanner (System.in);
		int n = Integer.parseInt(scan.nextLine());
		ArrayList <SinhVien> ds = new ArrayList<>();
		for (int i=0; i<n; i++){
			ds.add(new SinhVien(i+1,scan.nextLine(), scan.nextLine(), scan.nextLine(), Float.parseFloat(scan.nextLine())));
		}
		Collections.sort(ds);
		for ( SinhVien sv : ds){
			System.out.println(sv);
		}
		scan.close();
	}
}