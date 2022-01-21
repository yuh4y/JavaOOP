package DanhSachKhachHangFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable <Customer> {
	private String ma, hoten, sex, diachi;
	private Date ns;
	public Customer(int n,String hoten, String sex, String ns, String diachi) throws ParseException {
		this.ma = "KH" + String.format("%03d", n);
		this.hoten = hoten;
		this.sex = sex;
		this.diachi = diachi;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
	}
	private String getTen() {
		String[] s= hoten.trim().toLowerCase().split("\\s+");
		String res = "";
		for (int i=0; i<s.length; i++) {
			res += (String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1) + " ");
//			if(i<s.length-1) 
//				res+=" ";
		}
		return res.trim();
	}
	@Override
	public int compareTo(Customer o) {
		if(this.ns.before(o.ns)) 
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		return ma+" "+getTen()+" "+sex+" "+diachi+" "+new SimpleDateFormat("dd/MM/yyyy").format(ns);
		
	}
	
	
	
}
