package TinhtoanPhanSo;

public class phanSo {
    private long tu, mau;
	public phanSo () {
	}
	public phanSo (long tu, long mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	private static long gcd(long a, long b) {
		return a == 0 ? b : gcd(b%a, a);
	}
	/*private static phanSo RutGon (phanSo res){
		phanSo p = new phanSo();
		long temp = gcd (p.tu, p.mau);
		p.tu /= temp;
		p.mau /= temp;
		return p;
	}*/
	public static phanSo TinhTong (phanSo p1, phanSo p2) {
		phanSo tong = new phanSo ();
		tong.tu = (p1.tu *p2.mau + p1.mau*p2.tu);
		tong.mau = (p1.mau * p2.mau);
		long temp = gcd (tong.tu, tong.mau);
		tong.tu /= temp;
		tong.mau /= temp;
		return tong;
	}
	public static phanSo TinhTich(phanSo p1, phanSo p2){
		phanSo tich = new phanSo();
		tich.tu = p1.tu * p2.tu;
		tich.mau = p1.mau * p2.mau;
		long temp = gcd(tich.tu, tich.mau);
		tich.tu /= temp;
		tich.mau /= temp;
		return tich;
	}
	@Override
	public String toString() {
		return tu + "/" + mau;
	}
	
}
