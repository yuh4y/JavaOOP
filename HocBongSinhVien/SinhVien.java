package HocBongSinhVien;

public class SinhVien implements Comparable<SinhVien>{
    private String hoten,xeploai;
    private double diemtbc;
    private int diemrl,stt;
    public SinhVien(int stt, String hoten, double diemtbc, int diemrl) {
        this.stt = stt;
        this.hoten = hoten;
        this.diemtbc = diemtbc;
        this.diemrl = diemrl;
        getHocbong();
    }

    public void setXeploai(String xeploai){
        this.xeploai = xeploai;
    }
    public int getStt(){
        return stt;
    }
    public double getDiemtbc(){
        return diemtbc;
    }
    private void getHocbong(){
        if (diemtbc >= 3.6 && diemrl >= 90)
            this.xeploai = "XUATSAC";
        else if (diemtbc >= 3.2 && diemrl >= 80)
            this.xeploai = "GIOI";
        else if (diemtbc >= 2.5 && diemrl >= 70)
            this.xeploai = "KHA";
        else this.xeploai = "KHONG";
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.diemtbc < o.diemtbc)
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return hoten + ": " + xeploai;
    }

    

}
