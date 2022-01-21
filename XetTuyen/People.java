package XetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.time.LocalDate;
//import java.time.Period;
import java.util.Date;

public class People {
	private String hoten;
	private Date ns;
	private float diemlt, diemth;
	private String ma;
	
	public People(int n, String hoten, String ns, float diemlt, float diemth) throws ParseException {
		this.ma = "PH" + String.format("%02d", n);
		this.hoten = hoten;
		this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.diemlt = diemlt;
		this.diemth = diemth;
	}
	private String getTen() {
		String[] tmp = hoten.trim().toLowerCase().split("\\s+");
		String res = "";
		for (int i=0; i<tmp.length; i++) {
			res += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i<tmp.length-1)
				res+=" ";
		}
		return res;
	}
	private long getAge() {
//		Date date = Calendar.getInstance().getTime();
		Date now = new Date();
		long diffYears = now.getYear() - ns.getYear();
		return diffYears;
	}
	private float getDiemthuong() {
		if(diemlt >= 8 && diemth >= 8)
			return 1;
		else if(diemlt>=7.5 && diemth>=7.5)
			return 0.1f;
		else return 0;
	}
	private float getDiem() {
		float diem = (diemth + diemlt)/2 + getDiemthuong();
		if (diem>10) return 10;
		else return Math.round(diem);
	}
	private String chuanhoaDiem() {
		int res = (int) getDiem();
		if(res - getDiem() == 0) return String.valueOf(res);
		else return String.format("%.1f", getDiem());
	}
	private String getXeploai() {
		float diem = getDiem();
		if (diem<5) return "Truot";
		else if(diem<7) return "Trung binh";
		else if(diem<8) return "Kha";
		else if(diem<9) return "Gioi";
		else return "Xuat sac";
	}
	@Override
	public String toString() {
		return ma+" "+getTen()+" "+ getAge()+" "+chuanhoaDiem()+" "+getXeploai();
	}
	
}
