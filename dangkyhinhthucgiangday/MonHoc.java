package dangkyhinhthucgiangday;

public class MonHoc implements Comparable <MonHoc> {
	private String mamon, tenmon, lythuyet, thuchanh;
	private int sotinchi;
	public MonHoc(String mamon, String tenmon, int sotinchi, String lythuyet, String thuchanh) {
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.lythuyet = lythuyet;
		this.thuchanh = thuchanh;
		this.sotinchi = sotinchi;
	}
	private boolean getTH() {
//		String s = thuchanh.substring(thuchanh.length() - 13);
		String tmp = "";
		if (thuchanh.equals("Truc tuyen"))
			return true;
		else if (thuchanh.contains(".ptit.edu.vn"))
			return true;
		else return false;
	}
	@Override
	public int compareTo(MonHoc o) {
		if(this.mamon.compareTo(o.mamon) < 0)
			return -1;
		else return 1;
	}
	@Override
	public String toString() {
		if(getTH()==true) {
			return mamon + " " + tenmon + " " + sotinchi + " " + lythuyet + " " + thuchanh;
		}
		else return "";
	}
	
}
