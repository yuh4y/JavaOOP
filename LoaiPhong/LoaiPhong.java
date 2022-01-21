package LoaiPhong;

public class LoaiPhong implements Comparable <LoaiPhong> {
	private String kyhieu, ten, input;
	private int dongia;
	private double phi;
	public LoaiPhong(String input) {
		String a[] = input.split("\\s++");
		this.kyhieu = a[0];
		this.ten = a[1];
		this.dongia = Integer.parseInt(a[2]);
		this.phi = Double.parseDouble(a[3]);
	}
	@Override
	public int compareTo(LoaiPhong o) {
		if(this.ten.compareTo(o.ten) < 0)
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		return kyhieu + " " + ten + " " + dongia + " " + phi;
	}
	
	
	
}
