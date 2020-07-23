import java.util.ArrayList;
import java.util.HashMap;

// # Given a string str and an integer K, the task is to find the K-th most 
// # frequent character in the string. If there are multiple characters that 
// # can account as K-th the most frequent character then, print any one of them.


public class kth_occurrences {
	public char fun_kth_occurrences(String s, int n){
		ArrayList<String> ar = new ArrayList<String>();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String[] sp = s.split("");
		for(String d : sp){
			if(ar.contains(d)){
				hm.replace(d, hm.get(d)+1);
			}
			else{
				ar.add(d);
				hm.put(d, 1);
			}
		}
		
		return '0';
	}
}