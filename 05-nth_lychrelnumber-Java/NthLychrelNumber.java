// nthLychrelNumber(n) [20 pts]
// A Lychrel number is a natural number that cannot form a palindrome through the iterative process of 
// repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the 
// 196-algorithm, after the most famous number associated with the process.
// The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887….

public class NthLychrelNumber {
	public static long nthLychrelNumber(int n) {
		// Your code goes here
		int count = 0;
		long p  = 150;
		while(count != n){
			p++;
			if(isl(p)){
				count++;
			}
		}
		return p;
	}
	public static boolean ispal(long n){
		
		if(n < 0){
			
			n = -n;
		}
		long c =  0;
		String[] s = Long.toString(n).split("");
		if(s.length == 1){
			return true;
		}
		for(int i = s.length-1 ; i >= 0 ;i--){
			c = c*10 + Integer.parseInt(s[i]);
		}
		
		if(c == n){
			return true;
		}
		return false;
	}
	public static long pal(long n){
		boolean flag = true;
		if(n < 0){
			flag = false;
			n = -n;
		}
		if(n < 10){
			return n;
		}
		long c = 0;
		String[] s = Long.toString(n).split("");
		for(int i = s.length-1 ; i >= 0 ;i--){
			c = c*10 + Integer.parseInt(s[i]);
		}
		if(flag == false){c = -c;}
		return c;
	} 
	public static boolean isl(long n){
		int count = 0;
		while(count != 25 && !ispal(n)){
			n = n + pal(n);
			count++;
		}
		if(!ispal(n)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(nthLychrelNumber(20));
	}
}