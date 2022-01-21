package DSSVFileVB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    String masv;
    String hoten, lop;
    Date ns;
    Double gpa;
    public SinhVien(int n, String hoten, String lop, String ns, Double gpa) throws ParseException {
        this.masv = "B20DCCN" + String.format("%03d", n);
        this.hoten = hoten;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return masv + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
    
}
