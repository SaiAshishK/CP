// median(a) (10 pts)
// Write the non-destructive function median(a) that takes a list of ints or floats and returns the median value, 
// which is the value of the middle element, or the average of the two middle elements if there is no single middle 
// element. If the list is empty, return None.

public class Median {
	public static int median(double[] list) {
		// Your code goes here
		if(list.length == 1){
			return (int)list[0];
		}
		int p = (list.length/2);
		if(list.length%2==0){
			int res = (int)((list[p]+list[p-1])/2);
			return res;
		}
		else{
			return (int)list[p];
		}
		// return 0;
	}
	public static void main(String[] args) {
		System.out.println(median(new double[]{1,2}));
	}
}