package GiaTre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People implements Comparable <People> {
	private String ten;
	private Date ngaysinh;
	public People(String ten, String ngaysinh) throws ParseException {
		this.ten = ten;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
	}
	@Override
	public int compareTo(People o) {
		if(this.ngaysinh.before(o.ngaysinh))
			return 1;
		else return -1;
	}
	@Override
	public String toString() {
		return ten;
	}
	
}
