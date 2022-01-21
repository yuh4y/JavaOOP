package MyPackage;

import java.util.Scanner;

public class sapxepChon {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int [] a = new int [n+1];
		for (int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		int index=0;
		for (int i=0; i<n-1; i++) {
			int minArray=a[i];
			for (int j=i; j<n; j++) {
				if (minArray > a[j]) {
					minArray = a[j];
					index = j;
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
			System.out.print("Buoc " + (i+1) + ": ");
			for (int m=0; m<n; m++) {
				System.out.printf("%d ", a[m]);
			}
			System.out.print("\n");
		}
		scan.close();
	}

}
