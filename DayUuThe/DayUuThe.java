package DayUuThe;

import java.util.*;

public class DayUuThe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        //ArrayList <Integer> dayso = new ArrayList<Integer>();
        while (t-->0){
            String str = scan.nextLine();
            String[] temp = str.split("\\s+");
            int countLe = 0;
            int countChan = 0;
            int leng = temp.length;
            for (int i=0; i<leng; i++){
                if (Integer.parseInt(temp[i])%2 ==0)
                    countChan++;
                else countLe++;
            }
            if(leng%2==0 && countChan > countLe) System.out.println("YES");
            else if (leng%2==1 && countChan < countLe) System.out.println("YES");
            else System.out.println("NO"); 
        }
        scan.close();
    }
}
/*
2
11 22 33 44 55 66 77
23 34 45 56 67 78 89 90 121 131 141 151 161 171
*/