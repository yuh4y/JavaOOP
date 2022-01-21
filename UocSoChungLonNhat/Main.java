package UocSoChungLonNhat;

import java.util.Scanner;

public class Main {
	public static int gcd(int a,int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.print(a[0]+" ");
			for(int i=0;i<n-1;i++) {
				int ans=lcm(a[i], a[i+1]);
				System.out.print(ans+" ");
			}
			System.out.println(a[n-1]);
		}
	}

}