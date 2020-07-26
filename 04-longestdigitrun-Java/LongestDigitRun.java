// longestDigitRun(n) [20 pts]
// Write the function longestDigitRun(n) that takes a possibly-negative int value n and returns 
// the digit that has the longest consecutive 
// run, or the smallest such digit if there is a tie. So, longestDigitRun(117773732) returns 7 (
// because there is a run of 3 consecutive 7's), 
// as does longestDigitRun(-677886).

public class LongestDigitRun {
	public static int longestDigitRun(int n) {
		// Your code goes here
		if( n == 0){return 0;}
		if(n<0){n=-n;}
		String[] s = Integer.toString(n).split("");
		int count  = 0;
		int p = 0;
		int c = 1;
		for(int i = 1 ; i < s.length ; i++){
			if(s[i].equals(s[i-1])){
				count++;
				
				if(count > c){
					c = count;
					p = Integer.parseInt(s[i]);
				}
				if(count == c){
					if(p > Integer.parseInt(s[i])){
						p = Integer.parseInt(s[i]);
					}
				}
			}
			else{
				count = 1;
			}
		}
		System.out.println(c);
		if( p == 0){
			return min(s);
		}
		return p;
	}
	public static int min(String[] s){
		int q = Integer.MAX_VALUE;
		for(String s1 : s){
			if(Integer.parseInt(s1) < q){
				q = Integer.parseInt(s1);
			}
		}
		return q;
	}
	public static void main(String[] args) {
		System.out.println(longestDigitRun(44332211));
	}
}