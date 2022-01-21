package MyPackage;

import java.util.*;

public class TongUocSo {
	public static boolean [] isPrime = new boolean[2000006];
    public static int [] arrayPrime = new int[200005];
	
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		int k=0;
		for (int i=2; i*i<=2000005; i++) {
			if(isPrime[i] ==  true) {
				arrayPrime[k] = i;
				k++;
				for (int j=i*i; j<=2000005; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		long SumIntegerDivisor = 0;
		for (int i=0; i<n; i++) {
			if (isPrime[arr[i]] == true) {
				SumIntegerDivisor += arr[i];
			}
			else {
				int m=0;
				while (arr[i] != 1) {
					while (arr[i] % arrayPrime[m] == 0) {
						SumIntegerDivisor += arrayPrime[m];
						arr[i] /= arrayPrime[m];
					}
					if(isPrime[arr[i]]){
                        SumIntegerDivisor += arr[i];
                        break;
                    }
					m++;
				}
			}
		}
		System.out.print(SumIntegerDivisor);
		scan.close();
	}
	
}
