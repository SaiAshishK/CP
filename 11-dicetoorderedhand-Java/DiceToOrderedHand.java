// dicetoorderedhand(a, b, c) [5pts]
// Write the function dicetoorderedhand(a, b, c) that takes 3 dice and
// returns them in a hand, which is a 3-digit integer. However, even if the
// dice are unordered, the resulting hand must be ordered so that the largest
// die is on the left and smallest die is on the right. For example:
// assert(dicetoorderedhand(1,2,3) == 321)
// assert(dicetoorderedhand(6,5,4) == 654)
// assert(dicetoorderedhand(1,4,2) == 421)
// assert(dicetoorderedhand(6,5,6) == 665)
// assert(dicetoorderedhand(2,2,2) == 222)
// Hint: You can use max(a,b,c) to find the largest of 3 values, and
// min(a,b,c) to find the smallest.
import java.lang.Math;

public class DiceToOrderedHand {
	public int diceToOrderedHand(int a, int b, int c) {
		// your code goes here
		int max = max(a , b , c);
		int min = min(a , b , c);
		// System.out.println(max+" "+min);
		int m = 0;
		if(min <a && a <max){
			m =a;
		}
		else if(min <b && b <max){
			m = b;
		}
		else{
			m = c;
		}
		int res = (max*100) + (m*10) + min;
		return res;
	}
	public int max(int a, int b, int c) {
		if(a >= b && a >= c){
			return a;
		}
		else if (b >=a && b >=c){
			return b;
		}
		return c;
	}
	public int min(int a, int b, int c) {
		if(a <= b && a <= c){
			return a;
		}
		else if (b <=a && b <=c){
			return b;
		}
		return c;
	}


}