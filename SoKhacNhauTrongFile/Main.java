package SoKhacNhauTrongFile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream inFile = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int [100000];
        for (int i=0; i< 100000;i++){
            a[inFile.readInt()]++;
        }
        for (int i=0; i < 1000; i++){
            if (a[i]>0){
                System.out.println(i + " " + a[i]);
            }
        }
        inFile.close();
    }
}
