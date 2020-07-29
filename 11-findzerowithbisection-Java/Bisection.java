// Bisection Algorithm comes into play!
// We know that the square root of x lies between 1 and x, from mathematics
// Rather than exhaustively trying things starting at 1, suppose instead we pick a number in the middle of this range
// Bisection search works when value of function varies monotonically with input
// If g, the users input/guess, is less than/greater than the midpoint of the range, then that number becomes the new high point of said range and is then factored into the new search.

public class Bisection {
	public double bisection(int x, double epsilon, double step) {
		// your code goes here
		double hi= (double)x;
		double lo = 0.0;
		double middle=(hi+lo)/2;
		while (Math.abs(Math.pow(middle,2)-x) >= epsilon){
			if(Math.pow(middle,2) >x){
				hi=middle;
			}
			else if(Math.pow(middle,2) < x){
				lo=middle;
			}
			else{
				break;
			}
			middle=(lo+hi)/2;
		
			
	}
	return middle;
	// return 0.1;
}

}
