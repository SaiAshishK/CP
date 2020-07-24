import java.util.ArrayList;

// shortenLongRuns(L, k) [15 pts]
// Write the non-destructive function shortenLongRuns(L, k) that takes a list L and a positive integer k, and 
// non-destructively returns a similar list, only without any run of k consecutive equal values in L. This means that 
// any values that would otherwise produce a consecutive run of k elements are not present. 
// For example: 
// assert(shortenLongRuns([2, 3, 5, 5, 5, 3], 2) == [2, 3, 5, 3]) 
// assert(shortenLongRuns([2, 3, 5, 5, 5, 3], 3) == [2, 3, 5, 5, 3]) 
// Note: your function may not just create a copy of L and call the destructive version of this function (below) on 
// that copy and return it. Instead, you must directly construct the result here.

public class ShortenLongRuns {
	public static int[] shortenLongRuns(int[] arr, int k) {
		// Your code goes here
		ArrayList<Integer> res = new ArrayList<Integer>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int p = arr[0];
		ar.add(p);
		int c = 1;
		res.add(p);
		for(int q = 1 ; q < arr.length ;q++){
			if(ar.contains(arr[q])){
				if(c+1 < k-1){
					res.add(arr[q]);
				}
				c++;
			}
			else{
				res.add(arr[q]);
				c = 0;
				ar.clear();
				ar.add(arr[q]);
				
			}
		}
		int gg = 0;
		int[] res12 = new int[res.size()];
		for(int e : res){
			res12[gg++] = e;
		}

		return res12;
	}
}