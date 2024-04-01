package SomeProblem;

import java.util.*;

class CodeChef{
	public static int Sway(int a, int b, int k, int[] B, int N) {
		int fin = 0;
		long md = 1000000007;
		long ans = B[0]*B[N-1];
		if(b <= 1) {
			fin= (int)(ans); 
			return fin;
		}
		if(a <= 0){
			return Sway(0,b,k,B,N);
		}
		else {
			int M = Integer.MAX_VALUE;
			int ind = 0;
			for(int i = 0; i <= k; i++) {
				M = Math.min(B[a + i], M);
				if(M == (int)B[a + i]) ind = i;
			}
			ans = ((ans % md) * (M % md) % md) % md;
			
			return Sway(a - k + ind, b - k + ind, k, B, N);
		}
		 
	}
	
	public static void main(String[] args) throws java.lang.StackOverflowError {
		//Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(Sway(n-k-2,n-2,k,A,n));
		sc.close();
	}
}