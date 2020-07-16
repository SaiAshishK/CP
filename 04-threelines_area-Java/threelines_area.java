// # Write the function fun_threelines_area(d1, d2, d3) 
// # that takes length of 3 sides
// # find the area of a triangle(return an int) given its side lengths.
import java.lang.Math.*;
class threelines_area {
	public static int fun_threelines_area(int a, int b, int c){
		double p = ((double)a+(double)b+(double)c)/2.0;
		int area = (int)Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return area;
	}
	
}