// # Write the function nthHappyNumber(n) which takes a non-negative integer 
// # and returns the nth happy number (where the 0th happy number is 1). 
// # Here are some test assertions for you:
// # assert(nthHappyNumber(0) == 1)
// # assert(nthHappyNumber(1) == 7)
// # assert(nthHappyNumber(2) == 10)
// # assert(nthHappyNumber(3) == 13)
// # assert(nthHappyNumber(4) == 19)
// # assert(nthHappyNumber(5) == 23)
// # assert(nthHappyNumber(6) == 28)
// # assert(nthHappyNumber(7) == 31)


class nth_happy_number {

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


	public int fun_nth_happy_number(int n){
		// your code goes here
		int count = -1;
		int p = 0;
		while(count!=n){
			p++;
			boolean flag = isHappyNumber(p);
			if(flag){count++;}
			
		}
		return p;	
	}
}