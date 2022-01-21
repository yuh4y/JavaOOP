package DanhSachTrungTuyen;

public class ThiSinh implements Comparable <ThiSinh> {
	private String mats, hoten;
	private Double toan,ly, hoa;
	public ThiSinh(String mats, String hoten, Double toan, Double ly, Double hoa) {
		this.mats = mats;
		this.hoten = hoten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
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
	private double getDiemKhuvuc() {
		String khuvuc = mats.substring(0,3);
		if (khuvuc.equals("KV1"))
			return 0.5;
		else if (khuvuc.equals("KV2"))
			return 1;
		else if (khuvuc.equals("KV3"))
			return 2.5;
		else return 0;
	}
	private String chuanhoadiem(double diem) {
		int x = (int) diem;
		if(x- diem == 0)return String.valueOf(x);
		else return String.format("%.1f",diem);
		
	}
	public double getDiemxettuyen() {
		return toan*2+ly+hoa+ getDiemKhuvuc();
	}
	
	@Override
	public int compareTo(ThiSinh o) {
		if(this.getDiemxettuyen() < o.getDiemxettuyen())
			return 1;
		else if (this.getDiemxettuyen() == o.getDiemxettuyen()) {
			if(this.mats.compareTo(o.mats) < 0)
				return -1;
			else return 1;
		}
		else return -1;
	}
	@Override
	public String toString() {
//		String s = mats+" "+getTen()+" ";
//		double diemkv = getDiemKhuvuc();
//		if(diemkv == (int) diemkv) s += (int) diemkv + " ";
//		else s += diemkv + " ";
//		s += String.format("%.0f", getDiemxettuyen());
//		return s;
		return mats+" "+getTen()+" "+chuanhoadiem(getDiemKhuvuc())+" "+chuanhoadiem(getDiemxettuyen());
	}
	
}
