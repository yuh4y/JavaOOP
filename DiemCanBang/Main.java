package DiemCanBang;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-->0) {
			int n = Integer.parseInt(sc.nextLine());
			int[] arr = new int [n];
			String[] temp = sc.nextLine().split("\\s+");
			int mark=0;
			for (int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(temp[i]);
			}
			for (int i=1; i<n-1; i++) {
				int sum1=0;
				int sum2=0;
				for (int a=0; a<i; a++) {
					sum1 += arr[a];
				}
				for (int b=i+1; b<n; b++) {
					sum2 += arr[b];
				}
				if(sum1==sum2) {
					System.out.println(i+1);
					mark=1;
					break;
				}
			}
			if(mark==0) 
				System.out.println("-1");
		}
		sc.close();
	}

}

/*
2
7
-7 1 5 2 -4 3 0
5
1 2 3 4 5
*/ 
