package quanlybanhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
	private String makh, tenkh, gioitinh;
	private Date ns;
	private String diachi;
	public KhachHang(int n, String tenkh, String gioitinh, String ns, String diachi) throws ParseException {
		this.makh = String.format("KH%03d", n);
		this.tenkh = tenkh;
		this.gioitinh = gioitinh;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.diachi = diachi;
	}
	
	private String chuanHoaTen() {
		String s[] = tenkh.toLowerCase().split("\\s+");
		String res = "";
		for (int i=0; i<s.length; i++) {
			res+= (String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1));
			if(i<s.length) {
				res += " ";
			}
		}
		return res;
	}
	
	public String getMakh() {
		return makh;
	}
	@Override
	public String toString() {
		return chuanHoaTen() + " " + diachi;
	}
	
}
