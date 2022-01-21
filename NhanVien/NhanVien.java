package NhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
	private String ten, gioitinh, diachi, msthue,ngaykyhopdong, ma;
	private Date ns;

	public NhanVien(int n,String ten, String gioitinh, String ns, String diachi, String msthue, String ngaykyhopdong) throws ParseException {
		super();
		this.ma = String.format("%05d", n);
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.msthue = msthue;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.ngaykyhopdong = ngaykyhopdong;
	}
	private int GetAge(){
		String temp[] = new SimpleDateFormat("dd/MM/yyyy").format(ns).split("/");
		return 2021 - Integer.parseInt(temp[2]);
	}
	@Override
	public int compareTo(NhanVien o) {
		if (this.GetAge() < o.GetAge() )
			return 1;
		else if (this.GetAge() == o.GetAge()){
			return 0;
		}
		else return -1;
	}
	@Override
	public String toString() {
		return this.ma + " " + this.ten  + " " + this.gioitinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + this.diachi + " " + this.msthue + " " + this.ngaykyhopdong; 
	}
	
}
