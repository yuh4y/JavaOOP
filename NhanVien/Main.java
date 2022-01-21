package NhanVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner (System.in);
		ArrayList <NhanVien> ds = new ArrayList<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i=0; i<n; i++){
			ds.add(new NhanVien (i+1,scan.nextLine(), scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()));
		}
		Collections.sort(ds);
		for (NhanVien sv : ds){
			System.out.println(sv);
		}
		scan.close();
	}

}
