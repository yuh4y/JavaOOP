package DienThoaiCucGach;

public class DienThoai {
    private String message;

    public DienThoai(String message) {
        this.message = message;
    }
    private int chuyenDoiSo(char chucai){
        if(chucai == 'a' || chucai == 'b' || chucai == 'c') return 2;
        else if (chucai == 'd' || chucai == 'e' || chucai == 'f') return 3;
        else if (chucai == 'g' || chucai == 'h' || chucai == 'i') return 4;
        else if (chucai == 'j' || chucai == 'k' || chucai == 'l') return 5;
        else if (chucai == 'm' || chucai == 'n' || chucai == 'o') return 6;
        else if (chucai == 'p' || chucai == 'q' || chucai == 'r' || chucai == 's') return 7;
        else if (chucai == 't' || chucai == 'u' || chucai == 'v') return 8;
        else return 9;
    }

    private String checkThuanNghich (int[] arraykt){
        int j=arraykt.length - 1;
        for (int i=0; i<arraykt.length; i++){
            if (arraykt[i] != arraykt[j-i])
                return "NO";
        }
        return "YES";
    }

    private String xuly(){
        char[] daykitu = message.toCharArray();
        int[] temp = new int [daykitu.length];
        for (int i=0; i<daykitu.length;i++){
            temp[i] = chuyenDoiSo(daykitu[i]);
        }
        return checkThuanNghich(temp);
    }
    @Override
    public String toString() {
        return xuly();
    }

}
