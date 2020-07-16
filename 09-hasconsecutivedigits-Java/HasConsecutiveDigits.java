// hasConsecutiveDigits(n)  [10pts]
// Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that 
// number contains two consecutive digits that are the same, and False otherwise.

public class HasConsecutiveDigits {
	public boolean hasConsecutiveDigits(int n) {
		// your code goes here
		String[] s = Integer.toString(n).split("");
		for(int i = 0 ; i < s.length-1 ; i++){
			if(s[i].equals(s[i+1])){
				return true;
			}
		}
		return false;
	}
}