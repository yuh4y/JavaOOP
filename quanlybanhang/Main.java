package quanlybanhang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//nhap du lieu khach hang:
		int sokh = Integer.parseInt(sc.nextLine());
		ArrayList <KhachHang> dskhachhang = new ArrayList <>();
		for (int i=0; i< sokh; i++) {
			dskhachhang.add(new KhachHang(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		
		//nhap du lieu mat hang
		int somh = Integer.parseInt(sc.nextLine());
		ArrayList <MatHang> dsmathang = new ArrayList <>();
		for (int i=0; i<somh; i++) {
			dsmathang.add(new MatHang (i+1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
		}
		
		//nhap du lieu hoa don
		int sohd = Integer.parseInt(sc.nextLine());
		ArrayList <HoaDon> dshoadon = new ArrayList <>();
		for (int i=0; i<sohd; i++) {
			String a[] = sc.nextLine().split("\\s+");
			dshoadon.add(new HoaDon(i+1, timKhachHang(dskhachhang, a[0]), timMatHang(dsmathang, a[1]), Integer.parseInt(a[2])));
//			dshoadon.add(new HoaDon(i, a[0], a[1], Integer.parseInt(a[2])));
		}
		Collections.sort(dshoadon);
		for (HoaDon hd : dshoadon) {
			System.out.println(hd);
		}
	}
	//tim khach hang bang ma khach hang trong danh sach khach hang
	private static KhachHang timKhachHang(ArrayList<KhachHang> dskhachhang , String makhach) {
		for (KhachHang kh : dskhachhang) {
			if(kh.getMakh().equals(makhach))
				return kh;
		}
		return null;
	}
	
	//tim mat hang bang ma mat hang trong danh sach mat hang
	private static MatHang timMatHang(ArrayList<MatHang> dsmathang, String mamh) {
		for (MatHang mh : dsmathang) {
			if(mh.getMaMH().equals(mamh))
				return mh;
		}
		return null;
	}

}
