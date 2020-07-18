// isSorted(a) (10 Pts)
// Write the function isSorted(a) that takes a list of numbers and returns True if the list 
// is sorted (either smallest-first or largest-first) and False otherwise. Your function 
// must only consider each value in the list once (so, in terms of big-oh, which we will 
// learn soon, it runs in O(n) time, where n=len(a)), and so in particular you may not sort 
// the list.

public class IsSorted {
	public static boolean isSorted(double[] list) {
		// Your code goes here
		boolean rev = false;
		if(list[0] > list[1]){
			rev = true;
		}
		System.out.println(rev);
		if(rev == true){
			for(int i  = 1 ; i < list.length-1 ; i++){
				System.out.println("1.  "+list[i]+"   "+list[i+1]);
				if(list[i] < list[i+1]){
					return false;
				}
			}
			return true;
		}
		else{
			for(int i  = 1 ; i < list.length-1 ; i++){
				System.out.println("2.  "+list[i]+"   "+list[i+1]);
				if(list[i] > list[i+1]){
					
					return false;
				}
			}
			return true;
		}
		// return false;
	}
	public static void main(String[] args) {
		System.out.println(isSorted(new double[]{1, 2, 3, 4, 5}));
	}
}