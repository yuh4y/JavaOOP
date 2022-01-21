package BaitoanTinhcong;

public class NhanVien implements Comparable <NhanVien> {
	private String ma;
	private String ten;
	private int luongcoban;
	private int ngaycong;
	private String chucvu;
	
	public NhanVien (int n, String ten, int luongcoban, int ngaycong, String chucvu) {
		this.ma = "NV" + String.format("%02d", n);
		this.ten = ten;
		this.luongcoban = luongcoban;
		this.ngaycong = ngaycong;
		this.chucvu = chucvu;
	}
	private int luongthang() {
		return luongcoban*ngaycong;
	}
	private int thuong() {
		if (ngaycong >= 25) return luongthang()/5;
		else if (ngaycong < 25 && ngaycong >= 22) return luongthang()/10;
		else 
			return 0;
	}
	private int phucap() {
		if (chucvu.equals("GD")) return 250000;
		else if (chucvu.equals("PGD")) return 200000;
		else if (chucvu.equals("TP")) return 180000;
		else if (chucvu.equals("NV")) return 150000;
		else return 0;
	}
	private int thunhap() {
		return this.luongthang() + this.thuong() + this.phucap();
	}
	@Override
	public String toString() {
		return this.ma + " " + this.ten + " " + this.luongthang() + " " + this.thuong() + " " + this.phucap() + " " + this.thunhap();
	}
	@Override
	public int compareTo(NhanVien o) {
		if (this.thunhap() < o.thunhap())
			return 1;
		return -1;
	}
}
