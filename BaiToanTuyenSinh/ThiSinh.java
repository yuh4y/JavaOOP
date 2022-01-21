package BaiToanTuyenSinh;

public class ThiSinh {
	private String ma;
	private String hoten;
	private float toan, ly, hoa;

	public ThiSinh(String ma, String hoten, float toan, float ly, float hoa) {
		
		this.ma = ma;
		this.hoten = hoten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	private String getKv() {
		return ma.substring(0, 3);
	}

	private float getDiemut() {
		if (getKv().equals("KV1"))
			return 0.5f;
		else if (getKv().equals("KV2"))
			return 1f;
		else if (getKv().equals("KV3"))
			return 2.5f;
		else
			return 0;
	}

	private String chuanhoaDiem(float diem) {
		int tmp = (int) diem;
		if (diem - tmp == 0)
			return String.valueOf(tmp);
		else
			return String.format("%.1f", diem);
	}

	private float diem() {
		return toan * 2 + ly + hoa;
	}

	private String xepLoai() {
		float diem = diem() + getDiemut();
		if (diem < 24)
			return "TRUOT";
		else
			return "TRUNG TUYEN";
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + chuanhoaDiem(getDiemut()) + " " + chuanhoaDiem(diem()) + " " + xepLoai();
	}

}
