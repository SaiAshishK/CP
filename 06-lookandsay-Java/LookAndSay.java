import java.util.ArrayList;
import java.util.HashMap;

// First, you can read about look-and-say numbers here. Then, write the function lookAndSay(a) that takes a list of 
// numbers and returns a list of numbers that results from "reading off" the initial list using the look-and-say 
// method, using tuples for each (count, value) pair. For example:
// lookAndSay([]) == []
// lookAndSay([1,1,1]) == [(3,1)]
// lookAndSay([-1,2,7]) == [(1,-1),(1,2),(1,7)]
// lookAndSay([3,3,8,-10,-10,-10]) == [(2,3),(1,8),(3,-10)]
// lookAndSay([3,3,8,3,3,3,3]) == [(2,3),(1,8),(4,3)]

public class LookAndSay {
	public static String lookAndSay(int[] a) {
		// Your code goes here
		HashMap<Integer,Integer> hm =  new HashMap<Integer,Integer>();
		if(a.length == 0){
			return "[]";
		}
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int p = a[0];
		hm.put(p , 1);
		ar.add(p);
		String res = "[";
		for(int r = 1 ; r < a.length ; r++){
			if(ar.contains(a[r])){
				hm.replace(a[r],hm.get(a[r])+1);
			}
			else{
				for(int qw : hm.keySet()){
					String temp = "("+hm.get(qw)+", "+qw+"), ";
					res = res + temp;
				}
				hm.clear();
				ar.clear();
				ar.add(a[r]);
				hm.put(a[r], 1);
			}
		}
		for(int qw : hm.keySet()){
			String temp = "("+hm.get(qw)+", "+qw+"), ";
			res = res + temp;
		}
		res = res.substring(0,res.length()-2);
		res = res + "]";
		return res;
	}
	public static void main(String[] args) {
		System.out.println(lookAndSay(new int[]{1, 1, 1}));
	}
}