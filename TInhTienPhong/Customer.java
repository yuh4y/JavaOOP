package TInhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable <Customer>{
	private String tenkh,makh;
	private int sophong, phuphi;
	private Date checkin, checkout;
	public Customer(int n,String tenkh, int sophong, String checkin, String checkout, int phuphi) throws ParseException  {
		this.makh = "KH" + String.format("%02d", n);
		this.tenkh = tenkh;
		this.sophong = sophong;
		this.phuphi = phuphi;
		this.checkin = new SimpleDateFormat("dd/MM/yyyy").parse(checkin);
		this.checkout = new SimpleDateFormat("dd/MM/yyyy").parse(checkout);
	}
	private String getTen() {
		String[] str = tenkh.trim().toLowerCase().split("\\s+");
		String res = "";
		for (int i=0; i<str.length; i++) {
			res += (String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1));
			if (i<str.length-1) 
				res+=" ";
		}
		return res;
//		char[] a = tenkh.toLowerCase().trim().replaceAll("\s+", " ").toCharArray();
//        for(int i=0; i<a.length; i++) {
//            if(i==0) a[i]-=32;
//            else {
//                if(a[i]==' ') a[i+1]-=32;
//            }
//        }
//        return String.valueOf(a);
	}
	private long getSoNgay() {
		long time = checkout.getTime() - checkin.getTime();
		long diffDays = time / (24 * 60 * 60 * 1000);
		return diffDays+1;
	}
	
	private long getTienPhong() {
		int tang = (sophong/100);
		if (tang==1) return 25*getSoNgay() + phuphi;
		else if(tang==2) return 34*getSoNgay() + phuphi;
		else if(tang==3) return 50*getSoNgay() + phuphi;
		else return 80*getSoNgay() + phuphi;
	}
	@Override
	public int compareTo(Customer o) {
		if(this.getTienPhong() < o.getTienPhong())
			return 1;
		else return -1;
	}
	@Override
	public String toString() {
		return makh+" "+getTen()+" "+sophong+" "+getSoNgay()+" "+getTienPhong();
	}
	
	
}
