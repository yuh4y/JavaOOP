package PhanSoo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        PhanSoo ps = new PhanSoo(scan.nextLong(), scan.nextLong());
        System.out.print(ps);
    }
}
