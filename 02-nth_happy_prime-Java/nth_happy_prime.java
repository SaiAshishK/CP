// # A happy prime is a number that is both happy and prime. 
// # Write the function nthHappyPrime(n) which takes a non-negative integer 
// # and returns the nth happy prime number (where the 0th happy prime number is 7).


class nth_happy_prime {
	public static boolean isHappyNumber(int n) {
		// your code goes here
		int count = 0;
		while(count < 10 && n != 1){
			int p  =0;
			while(n  > 0){
				int q = n%10;
				n = n/10;
				q = (int)Math.pow(q,2);
				p+=q;

			}
			n = p;
			count++;
		}
		if(n == 1){
			return true;
		}

		return false;
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
	public int fun_nth_happy_prime(int n){
		// your code goes here
		int count = 0;
		int p  = 0;
		while(count-1 != n){
			p++;
			if(isHappyNumber(p) && isPrime(p)){
				count++;
			}
		}
		return p;	
	}
}