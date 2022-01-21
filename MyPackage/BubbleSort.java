package MyPackage;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int [] a = new int [n+1];
		for (int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i=0; i<n-1; i++) {
			int checkBreak = 0;
			for (int j=0; j<n-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					checkBreak = 1;
				}
			}
			if (checkBreak == 0)
			break;
			System.out.printf("Buoc %d: ", i+1);
			for (int m=0; m<n; m++) {
				System.out.printf("%d ", a[m]);
			}
			System.out.println("");
		}
		scan.close();
	}

}
