// isPerfectSquare(n)
// Write the function isPerfectSquare(n) that takes a possibly-non-int value, and returns True if
// it is an int that is a perfect square (that is, if there exists an integer m such that
// m**2 == n), and False otherwise. Do not crash on non-ints nor on negative ints.
import java.lang.Math;

public class IsPerfectSquare {
	public boolean isPerfectSquare(int n) {
      // Your code goes here
      double sq = Math.sqrt(n);
      int w = (int)sq;

		return sq == w;
	}
}
