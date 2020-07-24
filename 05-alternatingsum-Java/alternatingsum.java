// # Write the function alternatingSum(a) that takes a list of numbers and returns the 
// # alternating sum (where the sign alternates from positive to negative or vice versa). 
// # For example, alternatingSum([5,3,8,4]) returns 6 (that is, 5-3+8-4). If the list is empty, return 0.


class alternatingsum {
	public int fun_alternatingsum(int[] s){
		if(s.length ==0){
			return 0;
		}
		boolean flag = false;
		int res = 0;
		for(int p : s){
			if(flag == false){
				flag = true;
				res = res + p;
			}
			else{
				flag = false;
				res = res - p;
			}
		}
		return res;
	}
}