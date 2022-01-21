package BangKeNhapKho;

public class Product {
	private String ma, ten;
	private int  soluong, dongia;
	public Product(int n, String ten, int soluong, int dongia) {
		this.ma = getMa() + String.format("%02d", n);
		this.ten = ten;
		this.soluong = soluong;
		this.dongia = dongia;
	}
	private String getMa() {
		String[] tmp = ten.split("\\s+");
		String res = String.valueOf(tmp[0].charAt(0)+tmp[1].charAt(0));
		return res;
	}
	private int tienChietkhau() {
		if(soluong>10)
			return dongia*soluong/20;
		else if(soluong<=10)
			return dongia*soluong/50;
		else if(soluong<8)
			return dongia*soluong/100;
		else return 0;
	}
	private int thanhTien() {
		return dongia*soluong-tienChietkhau();
	}
	@Override
	public String toString() {
		return ma+" "+ten+" "+tienChietkhau()+" "+thanhTien();
	}
	
}
