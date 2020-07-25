// # Note: please do not start this problem prior to completing previous problem. 
// # Bearing in mind the definition of Kaprekar Number from above problem, write the function 
// # nearestKaprekarNumber(n) that takes an int value n and returns the Kaprekar number 
// # closest to n, with ties going to smaller value. For example, nearestKaprekarNumber(49) returns 45, 
// # and nearestKaprekarNumber(51) returns 55. And since ties go to the smaller number, 
// # nearestKaprekarNumber(50) returns 45. 
// # Note: as you probably guessed, this also cannot be solved by counting up from 0, 
// # as that will not be efficient enough to get past the autograder. 
// # Hint: one way to solve this is to start at n and grow in each direction until you find a Kaprekar number.
import java.math.*;


class nearestkaprekarnumber {
	public long fun_nearestkaprekarnumber(int n){
		int p1 = n;
		int p2 = n;
		while(!isKaprekar(p1)){
			p1--;
		}
		while(!isKaprekar(p2)){
			p2++;
		}
		if(n-p1 <= p2-n){
			return p1;
		}
		return p2;
	}

	public static boolean isKaprekar(int n){
		int sq1 = n*n;
		BigInteger np = new BigInteger(Integer.toString(n));
		BigInteger sq = np.pow(2);
		String dig1 =sq.toString();
		int dig = dig1.length();
		for(int i = 1 ; i < dig ; i++){
			int m = (int)Math.pow(10,i);
			if(m == n){
				continue;
			}
			BigInteger p = sq.divide(new BigInteger(Integer.toString(m)));
			BigInteger q = sq.mod(new BigInteger(Integer.toString(m)));
			if((p.add(q)).equals(new BigInteger(Integer.toString(n)))){
				
				return true;
			}
		}
		return false;
	}
}