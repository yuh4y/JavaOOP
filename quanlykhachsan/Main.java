package quanlykhachsan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		File fin = new File ("C:\\java\\JavaProjectPTIT\\src\\test.txt");
		Scanner sc = new Scanner (fin);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <Phong> dsphong = new ArrayList <>();
		while (t-->0) {
			String s[] = sc.nextLine().split("\\s+");
			dsphong.add(new Phong(s[0], s[1], Integer.parseInt(s[2]), Double.parseDouble(s[3])));
		}
		int n = Integer.parseInt(sc.nextLine());
		ArrayList <KhachHang> dskhachhang = new ArrayList<>();
		for(int i=0; i<n; i++) {
			dskhachhang.add(new KhachHang(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(dskhachhang);
		for(KhachHang kh : dskhachhang) {
			System.out.println(kh);
		}
		sc.close();
	}

}
