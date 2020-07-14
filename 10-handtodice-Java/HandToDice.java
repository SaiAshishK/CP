// Write the (very short) function handtodice(hand) that takes a hand, which is a 3-digit
// integer, and returns 3 values, each of the 3 dice in the hand. For example:
// assert(handToDice(123) == (1,2,3))
// assert(handToDice(214) == (2,1,4))
// assert(handToDice(422) == (4,2,2))
// Hint: You might find and % useful here, and also getKthDigit().
import java.util.Arrays;

public class HandToDice {
	public static int[] handToDice(int hand) {
		// your code goes here
		int[] s = new int[3];
		int res = hand%10;
		s[2] = res;
		hand = hand-res;
		hand = hand/10;
		int res1 = hand%10;
		s[1] = res1;
		// System.out.println(hand);
		hand = hand-res1;
		hand = hand/10;
		s[0] = hand;
		return s;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(handToDice(123)));
	}
}
