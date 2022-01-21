package DanhSachMonHocFile;

public class MonHoc implements Comparable <MonHoc> {
	private String ma, ten;
	private int tinchi;
	public MonHoc(String ma, String ten, int tinchi) {
		this.ma = ma;
		this.ten = ten;
		this.tinchi = tinchi;
	}
	@Override
	public int compareTo(MonHoc o) {
		if(this.ten.compareTo(o.ten) < 0)
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		return ma+" "+ten+" "+tinchi;
	}
	
}
