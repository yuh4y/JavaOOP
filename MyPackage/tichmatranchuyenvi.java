package MyPackage;

import java.util.Scanner;

public class tichmatranchuyenvi {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		int t = scan.nextInt();
		//while (t-->0) {
		for (int i=0; i<t; i++) {
			System.out.printf("Test %d:\n", i+1);
			int row = scan.nextInt();
			int column = scan.nextInt();
			int [][]array = new int [row][column];
			input(array, row, column);
		}
	}
	static void input(int array[][], int m, int n) {
		int [][] res = new int [m][m];
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				res[i][j] = 0;
			}
		}
		int [][] b = new int [n][m];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				array[i][j] = scan.nextInt();
				b[j][i] = array[i][j];
			}
		}
		for (int i=0; i<m;i++) {
			for (int j=0; j<m; j++) {
				for (int k=0; k<n; k++) {
					res[i][j] += array[i][k] * b[k][j];
				}
			}
		}
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				System.out.printf("%d ", res[i][j]);
			}
			System.out.println("");
		}
	}

}
