// isRotated(str1, str2) [10 pts]
// Write an efficient program to test if two given String is a rotation of each other or not, e.g. 
// if given String is "XYZ" and "ZXY" then your function should return true, but if the input is 
// "XYZ" and "YXZ" then return false.

public class IsRotated {
	public static boolean isRotated(String str1, String str2) {
		// Your code goes here
		String str3 = "";
		for(int i = str1.length()-1 ;i >=0 ;i--){
			str3 = str3 + str1.charAt(i);
		}
		System.out.println(str3);
		if(str2.equals(str3)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isRotated("12345", "54321"));
	}
}