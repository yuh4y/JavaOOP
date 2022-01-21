package BangDiemThanhPhan;

public class SinhVien implements Comparable <SinhVien> {
	private String masv, hoten, lop;
	private Double diem1,diem2,diem3;
//	private int stt;
	public SinhVien( String masv, String hoten, String lop, Double diem1, Double diem2, Double diem3) {
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		if (this.hoten.compareTo(o.hoten) < 0)
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		return masv + " " + hoten + " " + lop + " " + String.format("%.1f", diem1) + " " + String.format("%.1f", diem2) + " " + String.format("%.1f", diem3);
	}
	
	
}
