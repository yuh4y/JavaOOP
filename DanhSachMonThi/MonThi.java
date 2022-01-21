package DanhSachMonThi;

public class MonThi implements Comparable <MonThi> {
	private String mamon, tenmon, hinhthuc;

	public MonThi(String mamon, String tenmon, String hinhthuc) {
		
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.hinhthuc = hinhthuc;
	}

	@Override
	public int compareTo(MonThi o) {
		if (this.mamon.compareTo(o.mamon) < 0) 
			return -1;
		else return 1;
	}

	@Override
	public String toString() {
		return mamon + " " + tenmon + " " + hinhthuc;
	}
	
	
}
