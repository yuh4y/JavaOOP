package SapXepThoiGian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        ArrayList <ThoiGian> dongho = new ArrayList<>();
        while(t-->0){
            dongho.add(new ThoiGian (Integer.parseInt(scan.next()),Integer.parseInt(scan.next()),Integer.parseInt(scan.next())));
        }
        Collections.sort(dongho);
        dongho.forEach(System.out::println);
    }
}
