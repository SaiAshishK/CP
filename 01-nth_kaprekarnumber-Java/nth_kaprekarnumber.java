// # Background: a Kaprekar number is a non-negative integer, the representation of whose square 
// # can be split into two possibly-different-length parts (where the right part is not zero) 
// # that add up to the original number again. For instance, 45 is a Kaprekar number, because 
// # 45**2 = 2025 and 20+25 = 45. You can read more about Kaprekar numbers here. The first several 
// # Kaprekar numbers are: 1, 9, 45, 55, 99, 297, 703, 999 , 2223, 2728,... 
// # With this in mind, write the function nthKaprekarNumber(n) that takes a non-negative int n 
// # and returns the nth Kaprekar number, where as usual we start counting at n==0.
import java.lang.Math;
import java.math.*;



class nth_kaprekarnumber {
	public long fun_nth_kaprekarnumber(int n){
		if (n == 0){
			return (long)1;
		}
		int count = 0;
		int p = 1;
		while(n!=count){
			p++;
			if(isKaprekar(p)){
				count++;
			}
		}

		return (long)p;
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