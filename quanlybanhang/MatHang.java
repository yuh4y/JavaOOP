package quanlybanhang;

public class MatHang {
	private String donvi, mamh, tenmh;
	private long giamua, giaban;
	public MatHang(int n, String tenmh, String donvi, long giamua,long giaban) {
		this.mamh = String.format("MH%03d", n);
		this.tenmh = tenmh;
		this.donvi = donvi;
		this.giamua = giamua;
		this.giaban = giaban;
	}
	public String getMaMH() {
		return mamh;
	}
	public long getGiaban() {
		return giaban;
	}
	public long getGiamua() {
		return giamua;
	}
	@Override
	public String toString() {
		return tenmh;
	}
}
