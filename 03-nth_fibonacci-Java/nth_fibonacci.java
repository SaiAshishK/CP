// # Background: The Fibonacci numbers are defined by F(n) = F(n-1) + F(n-2). 
// # There are different conventions on whether 0 is a Fibonacci number, 
// # and whether counting starts at n=0 or at n=1. Here, we will assume that 
// # 0 is not a Fibonacci number, and that counting starts at n=0, 
// # so F(0)=F(1)=1, and F(2)=2. With this in mind, write the function 
// # nthfibonaccinumber(n) that takes a non-negative int n and returns the nth Fibonacci number.


class nth_fibonacci {
	
	public int fun_nthfibonaccinumber(int n){
		// your code goes here
		if(n==0 || n==1){
			return 1;
		}
		int p1 = 1;
		int p2 = 1;
		int p3 = 0;
		while(n > 1){
			p3 = p1 + p2;
			p1 = p2;
			p2 = p3;
			n--;
		}
		return p3;
	}
}