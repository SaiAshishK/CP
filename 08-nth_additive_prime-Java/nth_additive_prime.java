// # Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
// # and returns the nth Additive Prime, which is a prime number such that 
// # the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
// # is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2


class nth_additive_prime {
	public int fun_nth_additive_prime(int n){
		int p = 0;
		int count = -1;
		while(count != n){
			p++;
			if(isPrime(p) && isPrime(additive(p))){
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
	public static int additive(int n){
		int res = 0;
		String[] s = Integer.toString(n).split("");
		for(String s1 : s){
			res = res + Integer.parseInt(s1);
		}
		return res;
	} 
}