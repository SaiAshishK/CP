// # Write the function fun_distance(x1, y1, x2, y2) 
// # that takes four int values x1, y1, x2, y2 
// # that represent the two points (x1, y1) and (x2, y2), 
// # and returns the distance between those points as a int.

import java.lang.Math;
class distance {
	public int fun_distance(int x1, int y1, int x2, int y2){
		// Your code goes here
		int x = (x2-x1)*(x2-x1);
		int y = (y2-y1)*(y2-y1);
		int z = x+y;
		int res = (int)Math.sqrt(z);
		return res;
	}
}