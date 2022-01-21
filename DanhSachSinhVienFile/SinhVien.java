package DanhSachSinhVienFile;

public class SinhVien implements Comparable <SinhVien> {
	private String masv, hoten,lop, email;

	public SinhVien(String masv, String hoten, String lop, String email) {
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
	}
	private String chuanhoaTen() {
		String[] s = hoten.trim().toLowerCase().split("\\s+");
		String res = "";
		for (int i=0; i<s.length; i++) {
			res += (String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1));
			if (i<s.length) {
				res += " ";
			}
		}
		return res;
	}
	@Override
	public int compareTo(SinhVien o) {
		if(this.masv.compareTo(o.masv) < 0)
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		return masv+" "+chuanhoaTen()+" "+lop+" "+email;
	}
	
}
