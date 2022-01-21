package DanhSachMatHang;

public class MatHang implements Comparable <MatHang> {
	private String mamh, tenmh, donvi;
	private int giamua, giaban;
	
	public MatHang(int n, String tenmh, String donvi, int giamua, int giaban) {
		this.mamh = "MH" + String.format("%03d", n);
		this.tenmh = tenmh;
		this.donvi = donvi;
		this.giamua = giamua;
		this.giaban = giaban;
	}

	public int getLoinhuan() {
		return giaban - giamua;
	}

	@Override
	public int compareTo(MatHang o) {
		if (this.getLoinhuan() < o.getLoinhuan() )
			return 1;
		else if (this.getLoinhuan() ==  o.getLoinhuan())
			if(this.mamh.compareTo(o.mamh) > 0)
				return 1;
			else
				return -1;
		else return -1;
		
	}

	@Override
	public String toString() {
		return mamh + " " + tenmh + " " + donvi + " " + giamua + " " + giaban + " " + getLoinhuan();
	}
	
}
