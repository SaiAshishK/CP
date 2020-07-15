// # Write the function pascalsTriangleValue(row, col) 
// # that takes int values row and col, and returns the 
// # value in the given row and column of Pascal's 
// # Triangle where the triangle starts at row 0, and 
// # each row starts at column 0. If either row or col 
// # are not legal values, return None, instead of crashing. 
import java.lang.Math;

class get_kth_digit {
	public int fun_get_kth_digit(int digit, int k){
		// your code goes here
		int d = Math.abs(digit);
		String[] s = Integer.toString(d).split("");
		try{
			int c = Integer.parseInt(s[s.length -k -1]);
		return c;
		}
		catch(Exception e){
			return 0;
		}
	}
}