package quanlykhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class KhachHang implements Comparable <KhachHang> {
	private String makh,hoten, sophong;
	private Date checkin, checkout;
	private Phong phong;
	public KhachHang (int n, String hoten, String sophong, String checkin, String checkout) throws ParseException {
		this.phong = phong;
		this.makh = String.format("KH%02d", n);
		this.hoten = hoten;
		this.sophong = sophong;
		this.checkin = new SimpleDateFormat("dd/MM/yyyy").parse(checkin);
		this.checkout = new SimpleDateFormat("dd/MM/yyyy").parse(checkout);
	}
	private String getMa() {
		return String.valueOf(sophong.charAt(2));
	}
	private long soNgay() {
		long getDiff = checkout.getTime() - checkin.getTime();
		long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
		return getDaysDiff;
	}
	private double tinhTien() {
		long d = soNgay();
		long dongia = phong.getDongia(getMa());
		double phidv = phong.getPhidv(getMa());
		double res = d*dongia + d*phidv;
		if (d < 10)
			return res;
		else if(d < 20)
			return res*.98;
		else if(d < 30)
			return res*0.96;
		else
			return res*0.94;
	}
	@Override
	public int compareTo(KhachHang o) {
		if(this.soNgay() < o.soNgay())
			return 1;
		else return -1;
	}
	@Override
	public String toString() {
//		return makh + " " + hoten + " " + sophong + " " + soNgay() + " " + String.format("%.2f", tinhTien());
		return String.format("%.2f",tinhTien());
	}
	
}