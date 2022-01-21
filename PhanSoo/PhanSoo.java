package PhanSoo;

public class PhanSoo {
    private long tu, mau;
    public PhanSoo (long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd(long a, long b) {
		return a == 0 ? b : gcd(b%a, a);
	}
    @Override
    public String toString() {
        return this.tu / gcd(tu, mau) + "/" + this.mau / gcd(tu, mau);
    }
    
}
