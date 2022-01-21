package DanhSachDoanhNghiep;

public class DoanhNghiep implements Comparable <DoanhNghiep> {
	private String ma, ten, sosv;

	public DoanhNghiep(String ma, String ten, String sosv) {
		this.ma = ma;
		this.ten = ten;
		this.sosv = sosv;
	}

	@Override
	public int compareTo(DoanhNghiep o) {
		if(this.ma.compareTo(o.ma) < 0)
			return -1;
		else return 1;
		
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + sosv;
	}
	
}
