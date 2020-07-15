// isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
// represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
// a right triangle and False otherwise. You may wish to write a helper function,
// distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
// almostEqual (instead of ==) when comparing floats.
import java.lang.Math;

public class IsRightTriangle {
	public boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		// Your code goes here
		float d1 = (float)Math.pow(x2-x1,2) + (float)Math.pow(y2-y1,2);
		float d2 = (float)Math.pow(x3-x2,2) + (float)Math.pow(y3-y2,2);
		float d3 = (float)Math.pow(x3-x1,2) + (float)Math.pow(y3-y1,2);
		
		return (d1 == (d2+d3) ||d2==(d1+d3)|| d3==(d2+d1));
	}
}