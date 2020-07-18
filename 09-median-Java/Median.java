// median(a) (10 pts)
// Write the non-destructive function median(a) that takes a list of ints or floats and returns the median value, 
// which is the value of the middle element, or the average of the two middle elements if there is no single middle 
// element. If the list is empty, return None.

public class Median {
	public static int median(double[] list) {
		// Your code goes here
		if(list.length%2==0){
			int res = (int)((list[list.length/2]+list[(list.length/2)-1])/2);
			return res;
		}
		else{
			return (int)list[list.length/2];
		}
		// return 0;
	}
	public static void main(String[] args) {
		System.out.println(median(new double[]{1.1, 2.1, 3.1, 4.1, 5.1}));
	}
}