package MyPackage;

import java.util.Scanner;

public class DoichoTructiep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int [n+1];
		for (int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		int temp;
		for (int i=0; i < n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print("Buoc " + (i+1) + ": ");
			for (int m=0; m<n; m++) {
				System.out.printf("%d ", a[m]);
			}
			System.out.print("\n");
		}
		scan.close();
	}

}
