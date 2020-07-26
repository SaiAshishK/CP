// # Write the function fun_nth_palindromic_prime(n) that takes a non-negative int n 
// # and returns the nth palindromic Prime, which is a palidrome number such that 
// # it is also a prime. For example, 313 is a palindrome and it is prime 
// # so 313 is an palindrome Prime. fun_nth_palindrome_prime(0) returns 2


class nth_palindromic_prime {
	public int fun_nth_palindromic_prime(int n){
		return 0;
	}
	public static boolean isPalindrome(int s1,int s2){
		String s11 = Integer.toString(s1);
		String res = "";
		for(int i = s11.length()-1 ;i >= 0 ; i--){
			res = res + s11.charAt(i);
		}
		if(s2 == Integer.parseInt(res)){
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

}