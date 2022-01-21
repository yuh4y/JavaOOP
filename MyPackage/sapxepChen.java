package MyPackage;

import java.util.*;
public class sapxepChen {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int [] a = new int [100];
		for(int i=0; i<n; i++)
		{
			a[i] =  scan.nextInt();
		}
		xuly(a,n);
		scan.close();
	}
	static void xuly(int a[], int n){
		int [] b = new int [100];
		int k=0;
		for(int i=0; i<n; i++){
			b[k++]=a[i];
			if(k==1){
				System.out.printf("Buoc %d: %d\n",i,a[i]);
			}
			else{
				for(int j=0; j<k-1; j++){
					for(int x=j+1; x<k; x++){
						if(b[j]>b[x]) {
							int temp = b[j];
							b[j] = b[x];
							b[x] = temp;
						}
					}
				}
				System.out.printf("Buoc %d: ", i);
				for(int m=0; m<k; m++){
					System.out.printf("%d ", b[m]);
				}
				System.out.println("");
			}
		}
	}

}
