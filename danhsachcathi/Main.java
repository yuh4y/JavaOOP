package danhsachcathi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner sc = new Scanner (new File("CATHI.in"));
		ArrayList <CaThi> dscathi = new ArrayList <>();
		int t = Integer.parseInt(sc.nextLine());
		for (int i=0; i<t; i++) {
			dscathi.add(new CaThi (i+1,sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(dscathi);
		for (CaThi cathi : dscathi) {
			System.out.println(cathi);
		}
	}

}
