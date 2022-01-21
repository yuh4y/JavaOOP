package TinhToanThuNhap;

public class NhanVien implements Comparable <NhanVien> {
    private String hoten, chucvu, ma;
    private int luongcoban, ngaycong;
    public NhanVien (int n, String hoten, String chucvu, int luongcoban, int ngaycong)  {
        super();
        this.ma = "NV" + String.format("%02d", n);
        this.hoten = hoten;
        this.chucvu = chucvu;
        this.luongcoban = luongcoban;
        this.ngaycong = ngaycong;
    }
    private int luongChinh(){
        return luongcoban*ngaycong;
    }

    private int tamUng(){
        double temp = (phuCap()+luongChinh()) *2 / 3.0;
        if (temp < 25000)
            return (int) Math.round(temp /1000.0) *1000;
        else return 25000;
    }
    private int phuCap(){
        if (chucvu.equals("GD")) return 500;
        else if (chucvu.equals("PGD")) return 400;
        else if (chucvu.equals("TP")) return 300;
        else if (chucvu.equals("KT")) return 250;
        else return 100;
    }
    private int thuNhap(){
        return luongChinh() + phuCap();
    }
    private int conLai(){
        return thuNhap() - tamUng();
    }
    /*public String getChucvu(){
        return chucvu;
    }*/
    @Override
    public int compareTo(NhanVien o) {
        if(this.thuNhap() < o.thuNhap())
        return 1;
        else if (this.thuNhap() == o.thuNhap()){
            if (this.ma.compareTo(o.ma) < 0){
                return -1;
            }
            else return 1;
        }
        else return -1;
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " " + phuCap() + " " + luongChinh() + " " + tamUng() + " " + conLai();
    }
}
