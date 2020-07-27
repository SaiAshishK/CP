import java.util.ArrayList;
import java.util.*;
// # Write the function nthUglyNumber that takes a non-negative int n and returns the nth Ugly Number. 
// # Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 
// # 9, 10, 12, 15 shows the few ugly numbers. By convention, nthUglyNumber(0) will give 1.



class nth_uglynumber {
	public int fun_nth_uglynumber(int n){
		int count = -1;
		int p  = 0;
		while(count != n){
			p++;
			if(isugly(p)){
				count++;
			}
		}
		return p;
	}
	public static ArrayList<Integer> fact(int n){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				ar.add(i);
			}
		}
		return ar;
	}
	public static boolean isugly(int n) {
		ArrayList<Integer> a = fact(n);
		ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(2,3,5));
		for(Integer q : a){
			if(isPrime(q)){
				if(!a2.contains(q)){
					return false;
				}
			}
		}
		return true;
		
	}
	public static boolean isPrime(int n) {
		if(n <=1){
			return false;
		}
		for(int i = 2; i < n;i++){
			if(n%i == 0){
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a1 = fact(30);
		for(Integer g : a1){
			System.out.println(g);
		}
	}
}