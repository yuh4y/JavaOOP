package DanhSachSinhVienFile2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
	private String ma, hoten, lop;
	private Float gpa;
	private Date ns;
	public SinhVien(int n, String hoten, String lop, String ns, Float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", n);
		this.hoten = hoten;
		this.lop = lop;
		this.gpa = gpa;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
	}
	@Override
	public String toString() {
		return ma+" "+hoten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ns)+" "+String.format("%.2f", gpa);
	}
	
}
