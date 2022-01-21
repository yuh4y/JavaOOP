package DanhSachSinhVien;

public class SinhVien implements Comparable <SinhVien> {
	private String masv, hoten, lop, email;

	public SinhVien(String masv, String hoten, String lop, String email) {
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
	}
	public String getTen() {
		String[] str = hoten.split("\\s+");
		String res = "";
		for (int i=0; i<str.length; i++) {
			res += (String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1).toLowerCase());
			if (i<str.length -1)
				res += " ";
		}
		return res;
	}
	
	@Override
	public int compareTo(SinhVien o) {
		if (this.masv.compareTo(o.masv) > 0)
			return 1;
		else return -1;
		
	}
	@Override
	public String toString() {
		return masv + " " + getTen() + " " + lop + " " + email;
	}
	
}
