package LoaiBoSoNguyen;

import java.io.*;
import java.util.Scanner;
//import java.util.TreeSet;
import java.util.*;

public class Main {
	private static String res = "";
	public static boolean isInt(String s) {
		try {
			int n = Integer.parseInt(s);
		}
		catch (NumberFormatException e){
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner ( new File ("DATA.in"));
		ArrayList <String> text = new ArrayList <>();
		
		while (sc.hasNext()) {
			String str = sc.next();
			if(isInt(str) == false) {
				text.add(str + " ");
			}
		}
		Collections.sort(text);
		text.forEach(e -> res += (e + " "));
		
		System.out.println(res.trim());
		sc.close();
	}
	
}
