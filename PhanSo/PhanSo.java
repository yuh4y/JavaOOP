package PhanSo;

public class PhanSo {
	private long tu, mau;
	public PhanSo () {
	}
	public PhanSo (long tu, long mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	private long gcd(long a, long b) {
		return a == 0 ? b : gcd(b%a, a);
	}
	public PhanSo result (PhanSo p2) {
		PhanSo kq = new PhanSo ();
		kq.tu = this.tu *p2.mau + this.mau*p2.tu;
		kq.mau = this.mau * p2.mau;
		long tmp = gcd (kq.tu, kq.mau);
		kq.tu/=tmp;
		kq.mau/=tmp;
		return kq;
	}
	@Override
	public String toString() {
		return tu + "/" + mau;
	}
	
}
