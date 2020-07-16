// # Write the function bonusFindIntRoots(a,b,c) that takes 
// # the int coefficients a, b, c of a quadratic equation of this form:
// #      y = ax2 + bx + c
// # You are guaranteed the function has 2 real roots, and in fact that 
// # the roots are all integers. Your function should return these 2 int roots as a list
// # in increasing order. How does a function return multiple values? Like so:
// # return root1, root2


class find_int_roots {
	public int[] fun_find_int_roots(int a, int b, int c){
		// your code goes here
		
		int[] arr = {a,b,c};
		double coeff = Math.sqrt(Math.pow(arr[1],2) - 4 * arr[0] * arr[2]);
		double by = 2 * arr[0];
		double a1 = (-b - coeff)/by;
		double a2 = (-b + coeff)/by;
		int[] res = {(int)a1,(int)a2};
		return res;
			
	}
}