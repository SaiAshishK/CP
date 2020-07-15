// # Write the function nearestOdd(n) that takes an double n, 
// # and returns as an int value the nearest odd number to n. 
// # In the case of a tie, return the smaller odd value. 
// # Note that the result must be an int, so nearestOdd(13.0) is the int 13, and not the double 13.0.
import java.lang.Math;

class nearestodd {
	public static int fun_nearestodd(double n){
		// your code goes here
		int n1 = (int)Math.round(n);
		if(!(n1%2 == 0)){
			return n1;
		}
		else{
			int n2 = n1+1;//15
			int n3 = n1-1;//13
			if(n2-n > n-n3){
				return n3;
			}
			else{
				return n2;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(fun_nearestodd(12.0));
	}
}



