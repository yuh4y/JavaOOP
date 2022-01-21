package quanlybaitapnhomF;

public class Nhom implements Comparable <Nhom> {
	private SinhVien sinhvien;
	private BaiTap baitap;
	
	public Nhom(SinhVien sinhvien, BaiTap baitap) {
		this.sinhvien = sinhvien;
		this.baitap = baitap;
	}
	@Override
	public int compareTo(Nhom o) {
		if(this.sinhvien.getMa().compareTo(o.sinhvien.getMa()) < 0)
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		return sinhvien + " " + baitap;
	}
	
}
