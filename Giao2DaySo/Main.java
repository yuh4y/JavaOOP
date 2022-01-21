package Giao2DaySo;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        List<Integer> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        Set<Integer> setA= new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp=s.nextInt();
            setA.add(tmp);
        }
        for (int j = 0; j < m; j++) {
            int tmp=s.nextInt();
            setB.add(tmp);
        }
        temp.addAll(setA);
        temp2.addAll(setB);
        Collections.sort(temp);
        Collections.sort(temp2);
        for (int i = 0; i < temp.size(); i++) {
            for(int j=0; j<temp2.size(); j++){
                if(temp2.get(j).equals(temp.get(i)))
                    res.add(temp.get(i));             
            }
        }
        for (Integer i : res)
            System.out.print(i + " ");
        System.out.println();
    }
 
}