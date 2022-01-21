package hinhChuNhat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectange rec = new Rectange (scan.nextDouble(), scan.nextDouble(), scan.next());
		if (rec.getHeight() > 0 && rec.getWidth() > 0) {
			System.out.println(rec);
		}
		else 
			System.out.println("INVALID");
		scan.close();
	}
}