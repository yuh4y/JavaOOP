package TinhGio;

//import java.text.SimpleDateFormat;
import java.text.*;
import java.util.Date;
public class Time implements Comparable <Time> {
	private String ma, ten;
	private Date giovao, giora;
	
	public Time(String ma, String ten, String giovao, String giora) throws ParseException {
		this.ma = ma;
		this.ten = ten;
		this.giovao = new SimpleDateFormat("HH:mm").parse(giovao);
		this.giora = new SimpleDateFormat("HH:mm").parse(giora);
	}
	private long getHour() {
		long diff = giora.getTime() - giovao.getTime();
		long diffH = diff / (1000 * 60 * 60) % 24;
		return diffH;
	}
	private long getMinute() {
		long diff = giora.getTime() - giovao.getTime();
		long diffM = diff / (1000 * 60) % 60;
		return diffM;
	}
	
	@Override
	public int compareTo(Time o) {
		if (this.getHour() < o.getHour())
			return 1;
		else if (this.getHour() == o.getHour())
			if (this.getMinute() < o.getMinute())
				return 1;
			else return -1;
		else return -1;
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + getHour() + " gio " + getMinute() + " phut";
	}
	
	
}
