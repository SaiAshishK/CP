// Recursion-Only powersOf3ToN(n) [15 pts]
// Write the function powersOf3ToN(n) that takes a possibly-negative float or int n, and returns a list of the 
// positive powers of 3 up to and including n. As an example, powersOf3ToN(10.5) returns [1, 3, 9]. If no such powers 
// of 3 exist, you should return the empty list. You may not use loops/iteration in this problem. 
import java.util.*;
public class PowersOf3ToN {
	static int[] arr;
	static int p = -1;
	public int[] powersOf3ToN(double n) {
		// Your code goes here

		if(n < 1){
			return new int[0];
		}
		if(p == -1){
			arr = new int[pp((int)n)];
			p++;
		}
		arr[p] = (int)Math.pow(3,p);
		p++;
		if(p == (pp((int)n))){
			p = -1;
			return arr;
		}
		return powersOf3ToN(n);
	}
	public int pp(int n){
		while(!ispow3(n)){
			n--;
		}
		int res = 1;
		while(n != 1){
			n = n/3;
			res++;
		}
		return res;

	}
	public boolean ispow3(int n){
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}
	public static void main(String[] args) {
		PowersOf3ToN p = new PowersOf3ToN();
		System.out.println(p.pp(100));
		// System.out.println(Arrays.toString(p.powersOf3ToN(3)));
	}
}