// gcd(m, n) [10pts]  
// [Note: to receive any credit, you must solve this problem using Euclid's algorithm, and by no other means. In particular, do not just loop through all integers less than min(m,n) and find the common factors that way -- it is much too slow!]
// According to Euclid, the greatest common divisor, or gcd, can be found like so: 
//        gcd(x,y) == gcd(y, x%y) 
// We can use that to quickly find gcd's. For example: 
//         gcd(270,250) == gcd(250, 20) // 270 % 250 == 20 
//                  == gcd(20, 10) // 250 % 20 == 10 
//                  == gcd(10, 0) // 20 % 10 == 0 
// When we get to gcd(x,0), the answer is x. So gcd(270, 250) is 10. With this in mind, write the function gcd(x,y) that takes two positive integers x and y and returns their gcd using Euclid's gcd algorithm.

public class GCD {
	public static int gcd(int m, int n) {
		// Your code goes here
		while(m != n && m != 0 && n != 0){
			if(m > n){
				m = m % n;
			}
			else{
				n = n % m;
			}
			System.out.println(m + " " + n);
		}
		if(m == n){
			System.out.println("gg1");
			return m;
		}
		if(m == 0 || n == 0){
			System.out.println("gg2");
			return 0;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(gcd(270,250));
	}
}
