package SapXepMatHang;

public class Product implements Comparable<Product> {
	private String mahang, tenhang, nhomhang;
	private Double giamua, giaban;
	public Product(int n, String tenhang, String nhomhang, Double giamua, Double giaban) {
		this.mahang = "MH" + String.format("%02d", n);
		this.tenhang = tenhang;
		this.nhomhang = nhomhang;
		this.giamua = giamua;
		this.giaban = giaban;
	}
	private Double getLoiNhuan() {
		return giaban - giamua;
	}
	@Override
	public int compareTo(Product o) {
		if(this.getLoiNhuan() < o.getLoiNhuan())
			return 1;
		else return -1;
	}
	@Override
	public String toString() {
		return mahang+" "+tenhang+" "+nhomhang+" "+String.format("%.2f", getLoiNhuan());
	}
	
}
