package TinhTong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static boolean kiemTraSoNguyen(String s){
        try {
            int n = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public static void main(String[] args)throws FileNotFoundException {
        File fin = new File("DATA.in");
        Scanner sc = new Scanner(fin);
        long sum=0;
        while (sc.hasNext()){
            String number = sc.next();
            if(kiemTraSoNguyen(number) == true)
                sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
