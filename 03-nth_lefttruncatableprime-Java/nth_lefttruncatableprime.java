// # Write the function nthLeftTruncatablePrime(n).
// # A Left-truncatable prime is a prime which in a given base (say 10) does not contain 0 
// # and which remains prime when the leading (left) digit is successively removed. 
// # For example, 317 is left-truncatable prime since 317, 17 and 7 are all prime. 
// # There are total 4260 left-truncatable primes.
// # So nthLeftTruncatablePrime(0) retunearestKaprekarNumber(n)rns 2, and 
// # nthLeftTruncatablePrime(10) returns 53.



class nth_lefttruncatableprime {
	public static int fun_nth_lefttruncatableprime(int n){
		if(n==0){return 2;}
		int count = 0;

		int p = 2;
		while(count != n){
			p++;
			if(leftprime(p)){

				count++;
			}
		}
		return p;
	}

	public static boolean isPrime(int n) 
    {
        if (n <= 1)
            return false;
  
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
	} 
	public static boolean leftprime(int n){
		if(!isPrime(n)){
			return false;
		}
		while(n > 9){
			String temp = Integer.toString(n);
			temp = temp.substring(1);
			int p = Integer.parseInt(temp);
			if(!isPrime(p) || temp.substring(0,1).equals("0")){
				return false;
			}
			n = p;
		}
		return true;
	}
}

	