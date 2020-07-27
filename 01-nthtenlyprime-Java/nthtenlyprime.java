// # Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
// # and returns the nth Additive Prime, which is a prime number such that 
// # the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
// # is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2


class nthtenlyprime {
	public static int fun_nthtenlyprime(int n){
		int count = -1;
		int p = 0;
		while(count!= n){
			p++;
			if(isPrime(p) && isten(p)){
				count++;
			}
		}
		return p;
	}
	public static boolean isPrime(int n) {
		if(n <=1){
			return false;
		}
		for(int i = 2; i < n;i++){
			if(n%i == 0){
				return false;
			}
			
		}
		return true;
	}
	public static boolean isten(int n){
		if(n < 10){return false;}
		String[] sp = Integer.toString(n).split("");
		int c  = 0;
		for(String s1 : sp){
			c = c + Integer.parseInt(s1);
		}
		if(c  == 10){
			return true;
		}
		return false;
	}
}