package ThuNhapGiaoVien;

public class GiaoVien {
    private String ma, hoten;
    private int luongcoban;

    public GiaoVien(String ma, String hoten, int luongcoban) {
        this.ma = ma;
        this.hoten = hoten;
        this.luongcoban = luongcoban;
    }
    private int getPhucap(){
        String chucvu = ma.substring(0,2);
        if (chucvu.equals("HT")) return 2000000;
        else if (chucvu.equals("HP")) return 900000;
        else return 500000;
    }
    private int getHeso(){
        int heso = Integer.parseInt(ma.substring(2));
        return heso;
    }
    private int getLuong(){
        return getHeso() * luongcoban;
    }
    private int getThunhap(){
        return getLuong() + getPhucap();
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " " + getHeso() + " " + getPhucap() + " " + getThunhap();
    }
    
}
