package quanlybanhang;

public class HoaDon implements Comparable <HoaDon> {
	private String mahd;
	private KhachHang khachhang;
	private MatHang mathang;
	private int soluong;
	public HoaDon(int n, KhachHang makh, MatHang mamh, int soluong) {
		this.mahd = String.format("HD%03d", n);
		this.khachhang = makh;
		this.mathang = mamh;
		this.soluong = soluong;
	}
	public long getThanhTien() {
		return mathang.getGiaban() * soluong;
	}
	public long loiNhuan() {
		return (mathang.getGiaban() - mathang.getGiamua()) * soluong;
	}
	
	
	@Override
	public int compareTo(HoaDon o) {
		if (this.loiNhuan() < o.loiNhuan())
			return 1;
		else if(this.loiNhuan() == o.loiNhuan()) 
			return 0;
		else return -1;
	}
	@Override
	public String toString() {
		return mahd + " " + khachhang + " " + mathang + " " + soluong + " " + getThanhTien() + " " + loiNhuan();
	}
}
