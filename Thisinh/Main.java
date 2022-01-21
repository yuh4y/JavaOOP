package Thisinh;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner scan = new Scanner (System.in);
		ThiSinh ts = new ThiSinh (scan.nextLine(), scan.nextLine(), Float.parseFloat(scan.nextLine()), Float.parseFloat(scan.nextLine()),Float.parseFloat(scan.nextLine()));
		System.out.println(ts);
		scan.close();
	}

}
