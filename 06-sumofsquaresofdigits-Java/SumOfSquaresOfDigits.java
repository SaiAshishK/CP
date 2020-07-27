// Write the function sumOfSquaresOfDigits(n) which takes a non-negative integer and returns the 
// sum of the squares of its digits. Here are some test assertions for you:
// assert(sumOfSquaresOfDigits(5) == 25)   // 5**2 = 25
// assert(sumOfSquaresOfDigits(12) == 5)   // 1**2 + 2**2 = 1+4 = 5
// assert(sumOfSquaresOfDigits(234) == 29) // 2**2 + 3**2 + 4**2 = 4 + 9 + 16 = 29
import java.lang.Math;
public class SumOfSquaresOfDigits {
	public long sumOfSquaresOfDigits(int n) {
		// Your code goes here
		String[] s = Integer.toString(n).split("");
		int res = 0;
		for(String s1 : s){
			res = res + (int)Math.pow(Integer.parseInt(s1),2);
		}
		return res;
	}
}