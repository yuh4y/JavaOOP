package SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien> {
	private String ma;
	private String ten;
	private Date ns;
	private String lop;
	private float gpa;
	
	public SinhVien(int n, String ten, String lop, String ns, float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", n);
		this.ten = ChuanHoaTen(ten);
		this.lop = lop;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.gpa = gpa;
	}
	private String ChuanHoaTen(String ten){
		StringBuilder s = new StringBuilder ();
		StringTokenizer ss = new StringTokenizer (ten);
		while (ss.hasMoreTokens()){
			String temp = ss.nextToken();
			s.append(Character.toUpperCase(temp.charAt(0)));
			s.append(temp.substring(1).toLowerCase());
			s.append(" ");
		}
		return s.toString().trim();
	}

	@Override
	public String toString() {
		return this.ma + " " + ChuanHoaTen(ten) + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa); 
	}
	@Override
	public int compareTo(SinhVien o) {
		if (this.gpa < o.gpa)
			return 1;
		return -1;
	}
}
