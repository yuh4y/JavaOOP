package Thisinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThiSinh {
	private String ten;
	private Date ns;
	private float d1,d2,d3;
	
	public ThiSinh(String ten, String ns, float d1, float d2, float d3) throws ParseException {
		this.ten = ten;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	private float tongdiem() {
		return d1 + d2 + d3;
	}
	@Override
	public String toString() {
		return ten + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.1f", tongdiem()); 
	}
	
}
