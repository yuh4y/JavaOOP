package ChuanHoaTen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-->0){
            String input = scan.nextLine().trim().toLowerCase();
            String[] temp = input.split("\\s+");
            String output = "";
            for (int i=1; i<temp.length; i++){
                output += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
                if(i==temp.length - 1){
                    output += ", ";
                }
                else output += " ";
            }
            output += temp[0].toUpperCase();
            System.out.println(output);
        }
        scan.close();
    }
}
