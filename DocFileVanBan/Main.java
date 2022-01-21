package DocFileVanBan;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File filein = new File ("DATA.in");
        Scanner sc = new Scanner (filein);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
