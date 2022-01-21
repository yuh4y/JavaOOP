package quanlybaitapnhomF;

public class BaiTap {
	private int stt;
	private String tenbt;
	public BaiTap(int stt, String tenbt) {
		this.stt = stt;
		this.tenbt = tenbt;
	}
	public int getStt() {
		return stt;
	}
	@Override
	public String toString() {
		return stt + " " + tenbt;
	}
	
}
