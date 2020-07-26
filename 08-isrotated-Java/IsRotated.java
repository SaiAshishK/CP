// isRotated(str1, str2) [10 pts]
// Write an efficient program to test if two given String is a rotation of each other or not, e.g. 
// if given String is "XYZ" and "ZXY" then your function should return true, but if the input is 
// "XYZ" and "YXZ" then return false.

public class IsRotated {
	public static boolean isRotated(String str1, String str2) {
		// Your code goes here
		char str3 = str2.charAt(0);
		int p = 0;
		for(int i = 0 ; i < str1.length(); i++){
			char s = str1.charAt(i);
			if(s == str3){
				p = i;
			}
		}
		String res = str1.substring(p,str1.length()) + str1.substring(0,p);
		if(res.equals(str2)){
			return true;
		}
		return false;
	}
}