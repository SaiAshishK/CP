// trianglearea(s1, s2, s3)[5pts]
// Write the function trianglearea(s1, s2, s3) that takes 3 floats/ints and returns the area of the
// triangle that has those lengths of its side. If no such triangle exists, return 0. Hint: you
// will probably wish to use Heron's Formula.
import java.lang.Math;

public class TriangleArea {
	public static int triangleArea(double s1, double s2, double s3) {
		// Your code goes here
		double area = (s1 + s2 + s3)/2;
		int res = (int)Math.round(Math.sqrt(area * (area - s1) * (area - s2) * (area - s3)));
		System.out.println(res);
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(triangleArea(10.0,10.5,10.0));
	}
}