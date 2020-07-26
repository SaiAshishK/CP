// isRotation(x, y) [15 pts]
// Write the function isRotation(x, y) that takes two non-negative integers x and y, both 
// guaranteed to not contain any 0's, and 
// returns True if x is a rotation of the digits of y and False otherwise. For example, 
// 3412 is a rotation of 1234. Any number 
// is a rotation of itself.

public class IsRotation {
	public static boolean isRotation(int x, int y) {
		// Your code goes here
		String x1 = Integer.toString(x);
		String y1 = Integer.toString(y);

		char c = y1.charAt(0);
		int p = 0;
		for(int i = 0 ; i < x1.length() ; i++){
			char c1 = x1.charAt(i);
			if(c1 == c){
				p = i;
				break;
			}
		}
		System.out.println("  p  "+p);
		String s2 = x1.substring(p, x1.length()) + x1.substring(0, p);
		System.out.println("-----"+s2);
		if(s2.equals(y1) || x1.equals(y1)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isRotation(10010, 10100));
	}
}