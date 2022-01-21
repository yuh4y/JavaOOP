package quanlybaitapnhomF;

public class SinhVien  {
	private String hoten, sdt, masv;
	public SinhVien(String masv, String hoten, String sdt) {
		this.masv = masv;
		this.hoten = hoten;
		this.sdt = sdt;
	}
//	@Override
//	public int compareTo(SinhVien o) {
//		if(this.masv.compareTo(o.masv) < 0)
//			return -1;
//		else return 1;
//	}
	public String getMa() {
		return masv;
	}
	@Override
	public String toString() {
		return masv + " " + hoten + " " + sdt;
	}
	
}
