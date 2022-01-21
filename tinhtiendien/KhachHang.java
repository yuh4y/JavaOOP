package tinhtiendien;

public class KhachHang implements Comparable <KhachHang> {
	private String hoten, loai, makh;
	private int chisodau, chisocuoi;
	public KhachHang(int n, String hoten, String loai, int chisodau, int chisocuoi) {
		this.makh = String.format("KH%02d", n);
		this.hoten = hoten;
		this.loai = loai;
		this.chisodau = chisodau;
		this.chisocuoi = chisocuoi;
	}
	private String chuanHoa() {
		String s[] = hoten.toLowerCase().trim().split("\\s+");
		String res = "";
		for (int i=0; i< s.length; i++) {
			res+= (String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1));
			if (i<s.length) {
				res+= " ";
			}
		}
		return res;
	}
	private int dinhMuc() {
		if (loai.equals("A"))
			return 100;
		else if (loai.equals("B"))
			return 500;
		else return 200;
	}
	private int soDien() {
		return chisocuoi - chisodau;
	}
	private int tienTrongDinhMuc() {
		if (soDien() < dinhMuc())
			return soDien() * 450;
		else return dinhMuc() *450;
	}
	private int tienVuotDinhMuc() {
		if (soDien() < dinhMuc())
			return 0;
		else return (soDien() - dinhMuc()) * 1000;
	}
	private int tinhTien() {
		return tienTrongDinhMuc() + tienVuotDinhMuc() + tienVuotDinhMuc() / 20;
	}
	
	@Override
	public int compareTo(KhachHang o) {
		if(this.tinhTien() < o.tinhTien())
			return 1;
		else return -1;
	}
	
	@Override
	public String toString() {
		return makh + " " + chuanHoa() + " " + tienTrongDinhMuc() + " " + tienVuotDinhMuc() + " " + tienVuotDinhMuc() / 20 + " " + tinhTien();
	}
}
