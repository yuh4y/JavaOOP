package BangDiemHocSinh;

public class HocSinh implements Comparable<HocSinh> {
    private String ma;
    private String hoten;
    private double diemtb;

     public HocSinh(int masv,String hoten, String[] bangdiem) {
        this.ma = "HS" + String.format("%02d", masv);
        this.hoten = hoten;
        for (int i=0; i<bangdiem.length; i++){
            if (i==0 || i==1)
                diemtb += (Double.parseDouble(bangdiem[i])*2.0);

            else diemtb += Double.parseDouble(bangdiem[i]);
        }
        diemtb = Math.round(diemtb/12*10)/10.0;
    }
    
    private String getXeploai(){
        if (diemtb >= 9) return "XUAT SAC";
        else if (diemtb >= 8) return "GIOI";
        else if (diemtb >= 7) return "KHA";
        else if (diemtb >= 5) return "TB";
        else  return "YEU";
    }
    

    @Override
    public String toString() {
        return ma + " " + hoten + " " + String.format("%.1f", diemtb) + " " + getXeploai();
    }

    @Override
    public int compareTo(HocSinh o) {
        if (this.diemtb < o.diemtb) return 1;
        else if (this.diemtb == o.diemtb) {
            if (this.ma.compareTo(o.ma) > 0) return 1;
            else return -1;
        }
        else return -1;
    }
    
}

