package HocBongSinhVien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sc = scan.nextLine().split("\\s+");
        int N = Integer.parseInt(sc[0]);
        int M = Integer.parseInt(sc[1]);
        ArrayList <SinhVien> danhsach = new ArrayList<SinhVien>();
        for(int i=1; i<=N; i++) {
            String hotensv = scan.nextLine();
            String[] scc = scan.nextLine().split("\\s+");
            danhsach.add(new SinhVien(i, hotensv, Double.parseDouble(scc[0]), Integer.parseInt(scc[1])));
        }
        Collections.sort(danhsach);
        double diemsan = danhsach.get(M-1).getDiemtbc();
        Collections.sort(danhsach, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2){
                if (sv1.getStt() < sv2.getStt()) return -1;
                else return 1;
            }
        });
        for (SinhVien sv : danhsach){
            if (sv.getDiemtbc() >= diemsan){
                System.out.println(sv);
            }
            else{
                sv.setXeploai("KHONG");
                System.out.println(sv);
            }
        }
        scan.close();
    }
}
