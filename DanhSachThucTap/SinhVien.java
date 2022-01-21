package DanhSachThucTap;

public class SinhVien implements Comparable <SinhVien> {
	private String masv, hoten, lop, email, doanhnghiep;
	private int stt;

	public SinhVien(int stt, String masv, String hoten, String lop, String email, String doanhnghiep) {
		this.stt = stt;
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
		this.doanhnghiep = doanhnghiep;
	}
	public String getDoanhnghiep() {
		return doanhnghiep;
	}
	@Override
	public int compareTo(SinhVien o) {
		if (this.masv.compareTo(o.masv) < 0)
			return -1;
		else
			return 1;
	}

	@Override
	public String toString() {
		return stt + " " + masv + " " + hoten + " " + lop + " " + email + " " + doanhnghiep;
	}
	
}
