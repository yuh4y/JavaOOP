package QuanLyBaiTapNhom;

public class SinhVien implements Comparable <SinhVien> {
	private String ma, hoten,phone;
	private int stt;
	public SinhVien(String ma, String hoten, String phone, int stt) {
		
		this.ma = ma;
		this.hoten = hoten;
		this.phone = phone;
		this.stt = stt;
	}
	public int getStt() {
		return stt;
	}
	@Override
	public String toString() {
		return ma+" "+hoten+" "+phone+" "+stt;
	}
	@Override
	public int compareTo(SinhVien o) {
		if(this.ma.compareTo(o.ma) < 0)
			return -1;
		else return 1;
	}
	
}
