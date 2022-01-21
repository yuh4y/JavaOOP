package SinhVienThucTap;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String madn, tendn;
    private int sosv;

    public DoanhNghiep(String madn, String tendn, int sosv) {
        this.madn = madn;
        this.tendn = tendn;
        this.sosv = sosv;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if (this.sosv < o.sosv) return 1;
        else if (this.sosv == o.sosv){
            if(this.madn.compareTo(o.madn) < 0) return -1;
            else return 1;
        }
        else return -1;
    }
    public int getSoSV(){
        return sosv;
    }
    @Override
    public String toString() {
        return madn + " " + tendn + " " + sosv;
    }
   
    
}
