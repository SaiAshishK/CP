// Happy Primes [20 pts]
// Background: read the first paragraph from the Wikipedia page on happy numbers. After 
// some thought, we see that no matter what number we start with, when we keep replacing 
// the number by the sum of the squares of its digits, we'll always either arrive at 4 (
// unhappy) or at 1 (happy). With that in mind, we want to write the function nthHappyNumber
// (n). However, to write that function, we'll first need to write isHappyNumber(n) (
// right?). And to write that function, we'll first need to write sumOfSquaresOfDigits(n). 
// And that's top-down design! Here we go.... 
// Note: the autograder will grade each of the following functions, so they are required. 
// However, they also are here specifically because they are just the right helper 
// functions to make nthHappyNumber(n) easier to write!
import java.lang.Math;

public class IsHappyNumber {
	public static boolean isHappyNumber(int n){
		System.out.println("number "+n);
		int p = 0;
		while((n!= 1 && n != 4) && p != 10){
			n = sumOfSquaresOfDigits(n);
			p++;
		}
		System.out.println("   n   "+n);
		if(n == 1){
			return true;
		}
		return false;

	}
	public static int sumOfSquaresOfDigits(int n){
		String[] s = Integer.toString(n).split("");
		int res = 0;
		for(String s1 : s){
			res = res + (int)Math.pow(Integer.parseInt(s1),2);
		}
		System.out.println("         "+res);
		return res;
	}
	public static void main(String[] args) {
		System.out.println(isHappyNumber(940));
	}

}