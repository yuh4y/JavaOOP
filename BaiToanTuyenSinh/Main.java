package BaiToanTuyenSinh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ThiSinh thisinh = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
				Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
		System.out.println(thisinh);
		sc.close();
	}

}
