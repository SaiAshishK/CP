import java.util.ArrayList;

// removeDuplicate(text) [10 pts]
// Write a program to remove all the duplicate characters from a given input String,e.g.
// if given String is "JavaPython" then the output should be "JavPython".
// The second or further occurrence of duplicate should be removed.

public class RemoveDuplicate {
	public String removeDuplicate(String text) {
		// Your code goes here
		String[] text1 = text.split("");
		String res = "";
		ArrayList<String> ar = new ArrayList<String>();
		for(String s : text1){
			if(!ar.contains(s)){
				ar.add(s);
				res = res + s;
			}
		}
		return res;
	}
}