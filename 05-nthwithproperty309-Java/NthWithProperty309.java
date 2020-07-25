import java.math.BigInteger;

// nthWithProperty309(n) [20 pts]
// We will say that a number n has "Property309" if its 5th power contains every 
// digit (from 0 to 9) at least once. 309 is the smallest number with this property. 
// Write the function nthWithProperty309 that takes a non-negative int n and returns 
// the nth number with Property309.
import java.lang.Math;
import java.util.*;

public class NthWithProperty309 {
	public static boolean isTrue(BigInteger bg){
		
		String[] s = bg.toString().split("");
		int y = 0;
		int[] s1 = new int[s.length];
		for(String h: s){
			s1[y++] = Integer.parseInt(h);
		}

		int[] all = {0,1,2,3,4,5,6,7,8,9};
		

		return Arrays.asList(s1).containsAll(Arrays.asList(all));
	}
	public static int nthWithProperty309(int n) {
		//Your code goes here
		if(n == 0){
			return 309;
		}
		if(n>0){
			int p = 310;
			// String p1 = Integer.toString(p);
			int count = 0;
			while(count != n){
				String p5 = Integer.toString(p);
				BigInteger bg = new BigInteger(p5);
				BigInteger res = bg.pow(5);
				if(isTrue(res)){
					p++;
					count++;
				}
				p++;
			}
			return p-2;
		}
		return -1;
	}
	public static void main(String[] args) {
		// System.out.println(nthWithProperty309(100));
		System.out.println(isTrue(new BigInteger("2014")));
	}
}