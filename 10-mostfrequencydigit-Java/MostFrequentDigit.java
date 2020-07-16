// mostFrequentDigit(n) [10pts]
// Write the function mostFrequentDigit(n), that takes a non-negative integer n and returns the digit from 0 to 9 
// that occurs most frequently in it, with ties going to the smaller digit.

public class MostFrequentDigit {
	public int mostFrequentDigit(int n) {
		// Your code goes here
		if(n<0){n = -n;}
		if(n == 0){
			return 1;
		}
		if(n<=9){
			return n;
		}
		
		String[] s = Integer.toString(n).split("");
		int[] count = new int[10];
		for(String g : s){
			int q = Integer.parseInt(g);
			count[q]++;
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < 10 ; i++){
			
			if(max < count[i]){
				max = count[i];
				index = i;
			}
		}
		return index;
	}
}