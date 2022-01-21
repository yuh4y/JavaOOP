package DSSVFileVB;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File infile = new File ("SV.in");
        Scanner sc = new Scanner(infile);
        ArrayList <SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i=0; i<t; i++){
            ds.add(new SinhVien(i+1 , sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for (SinhVien sv : ds)
            System.out.println(sv);
    }
}
