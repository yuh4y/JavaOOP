package danhsachcathi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi implements Comparable <CaThi> {
	private String macathi;
	private Date ngaythi,giothi;
	private int phongthi;
	public CaThi(int n, String ngaythi, String giothi, int phongthi) throws ParseException {
		this.macathi = "C" + String.format("%03d", n) ;
		this.ngaythi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythi);
		this.giothi = new SimpleDateFormat("hh:mm").parse(giothi);
		this.phongthi = phongthi;
	}
	@Override
	public int compareTo(CaThi o) {
		if(this.ngaythi.compareTo(o.ngaythi)<0)
			return -1;
		else if(this.ngaythi.equals(o.ngaythi)) {
			if(this.giothi.compareTo(o.giothi) < 0)
				return -1;
			else if (this.giothi.equals(o.giothi)) {
				if (this.macathi.compareTo(o.macathi) <0)
					return -1;
				else return 1;
			}
			else return 1;
		}
		else return 1;
	}
	@Override
	public String toString() {
		return macathi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaythi) + " " + new SimpleDateFormat("HH:mm").format(giothi) + " " + phongthi;
	}
	
}
