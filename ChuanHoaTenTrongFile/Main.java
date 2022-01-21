package ChuanHoaTenTrongFile;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File ("DATA.in"));
        while (sc.hasNextLine()){
            String s = sc.nextLine().trim().toLowerCase();
            if(s.equals("end")) break;
            else {
	            String[] line = s.split("\\s+");
	            String output = "";
	            for (int i=0; i<line.length;i++) {
	            	output += String.valueOf(line[i].charAt(0)).toUpperCase() + line[i].substring(1);
	            	if(i != line.length-1)
	            		output += " ";
	            }
	            System.out.println(output);
	        }
	    }
        sc.close();
	}

	@Override
	public String toString() {
		return "Main []";
	}
}
