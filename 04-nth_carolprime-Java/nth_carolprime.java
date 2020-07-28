// # Write the function nthCarolPrime(n), which takes a non-negative int and returns the nth Carol Prime, 
// # which is a prime number of the form ((2**k - 1)**2 - 2) for some value positive int k. For example, 
// # if k equals 3, ((2**3 - 1)**2 -2) equals 47, which is prime, and so 47 is a Carol Prime. 
// # The first several Carol primes are: 7, 47, 223, 959, 3967, 16127, 65023, 261119, 1046527,... As such, 
// # nthCarolPrime(0) returns 7.
// # Note: You must use a reasonably efficient approach that quickly works up to n==9, which 
// # will return a 12-digit answer! In particular, this means you cannot just edit isPrime. 
// # Hint: you may need to generate only Carol numbers, and then test those as you go 
// # for primality (and you may need to think about that hint for a while for it to make sense!).



class nth_carolprime {
	public int fun_nth_carolprime(int n){
		int count = -1;
		int p = 1;
		while(n!=count){
			p++;
			count++;
			
		}
		System.out.println("  count  "+count+"  p "+carol(p));
        return carol(p);
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
	public static int carol(int n){
		int temp1 = ((int)Math.pow(2,n) - 1);
		int temp2 = ((int)Math.pow(temp1,2) - 2);
		return temp2;
	}
}