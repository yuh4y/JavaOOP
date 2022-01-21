package SapXepThoiGian;

public class ThoiGian implements Comparable<ThoiGian> {
    private int gio, phut, giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(ThoiGian o) {
        if (this.gio > o.gio) return 1;
        else if (this.gio == o.gio) {
            if (this.phut > o.phut) return 1;
            else if (this.phut == o.phut) {
                if (this.giay > o.giay) return 1;
                else if (this.giay == o.giay) return 0;
                else return -1;
            }
            else return -1;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
    
}
