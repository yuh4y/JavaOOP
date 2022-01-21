package DanhSachGiangVien;

public class GiangVien {
	private String hoten, bomon;
	private String magv;

	public GiangVien(int ma,String hoten, String bomon) {
		this.magv = "GV" + String.format("%02d", ma);
		this.hoten = hoten;
		this.bomon = bomon;
	}
	public String getTen() {
		return hoten;
	}
	public String getBomon() {
		String[] str = bomon.toUpperCase().split("\\s+");
		String tmp = "";
		for (int i=0; i<str.length;i++) {
			tmp += str[i].charAt(0);
		}
		return tmp;
	}
	
	@Override
	public String toString() {
		return magv + " " + hoten + " " + getBomon();
	}
	
	
}
