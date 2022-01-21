package SapXepMaTran;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fin = new File ("MATRIX.in");
		Scanner sc = new Scanner (fin);
		int t = Integer.parseInt(sc.nextLine());
		while (t-->0) {
			int hang = sc.nextInt();
			int cot = sc.nextInt();
			int tmp = sc.nextInt();
			int a[][] = null;
			for (int i=0; i<hang-1; i++) {
				for (int j=0; j<cot-1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int temp = 0;
			for (int k=0; k<hang-2; k++) {
				for (int h=k+1; h<hang-2; h++) {
					if(a[k][tmp] > a[h][tmp])
						temp = a[k][tmp];
						a[k][tmp] = a[h][tmp];
						a[h][tmp] = temp;
				}
			}
			for (int m=0; m<hang-1; m++) {
				for (int n=0; n<cot-1; n++) {
					System.out.print(a[m][n]);
					if(n<cot-1) {
						System.out.println(" ");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
