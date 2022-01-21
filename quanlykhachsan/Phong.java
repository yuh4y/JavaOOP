package quanlykhachsan;

public class Phong {
	private String loaiphong, maphong;
	private long gia;
	private double phidv;
	public Phong(String maphong, String loaiphong, int gia, double phidv) {
		this.loaiphong = loaiphong;
		this.maphong = maphong;
		this.gia = gia;
		this.phidv = phidv;
	}
	public long getDongia(String s) {
		if(s.equals("B"))
			return 150;
		else return 200;
	}
	public double getPhidv(String s) {
		if(s.equals("B"))
			return 0.03;
		else return 0.05;
	}
}
