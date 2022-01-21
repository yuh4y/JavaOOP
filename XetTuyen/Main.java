package XetTuyen;
import java.io.File;
import java.io.FileNotFoundException;
//
//import java.io.File;
//import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException, FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File ("XETTUYEN.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList <People> danhsach = new ArrayList <>();
		for (int i=0; i<t; i++) {
			People pp = new People(i+1,sc.nextLine(), sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
			danhsach.add(pp);
		}
		for(People peo : danhsach)
			System.out.println(peo);
		sc.close();
	}

}
/*
C:\java\JavaProjectPTIT\src\test.txt
*/
