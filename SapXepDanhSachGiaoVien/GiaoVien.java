package SapXepDanhSachGiaoVien;

public class GiaoVien implements Comparable<GiaoVien> {
    private String hoten, bomon, magv;
    public GiaoVien(int n, String hoten, String bomon) {
        this.magv = "GV" + String.format("%02d", n);
        this.hoten = hoten;
        this.bomon = bomon;
    }
    
    private String getTen(){
        String[] temp = hoten.split("\\s+");
        String res = temp[temp.length - 1];
        return res;
    }
    private String getMon(){
        String[] tempM = bomon.split("\\s+");
        String result = "";
        for(int i=0; i<tempM.length;i++){
            result += Character.toUpperCase(tempM[i].charAt(0));
        }
        return result;
    }
    @Override
    public int compareTo(GiaoVien o) {
        if(this.getTen().equals(o.getTen())){
            if(this.magv.compareTo(o.magv) <0)
                return -1;
            else return 1;
        }
        else if(this.getTen().compareTo(o.getTen()) < 0)
            return -1;
        else 
            return 1;
    }

    @Override
    public String toString() {
        return magv + " " + hoten + " " + getMon();
    }
    
}
