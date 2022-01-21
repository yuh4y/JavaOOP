package SapXepSinhVien;

public class SinhVien {
    private String masv, hoten, lop, email;
    
    public SinhVien(String masv, String hoten, String lop, String email) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }
    public String getLop(){
        return lop;
    }
    public String getMasv(){
        return masv;
    }
    public String getNganh(){
        String temp = masv.substring(3,7);
        if (temp.equals("DCKT")) return "Ke toan";
        else if (temp.equals("DCCN")) return "Cong nghe thong tin";
        else if (temp.equals("DCAT")) return "An toan thong tin";
        else if (temp.equals("DCVT")) return "Vien thong";
        else return "Dien tu";
    }
    @Override
    public String toString() {
        return masv + " " + hoten + " " + lop + " " + email;
    }

}
