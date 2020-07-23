// # Write the function alternatingSum(L) that takes a possibly-empty array of numbers, 
// # and returns the alternating sum of the array, where every other value is subtracted 
// # rather than added. For example: alternatingSum([1,2,3,4,5]) returns 1-2+3-4+5 
// # (that is, 3). If L is empty, return 0. You may not use loops/iteration in this problem.


class recursions_alternatingsum {
	static int res = 0;
	static int p = 0;
	static int res1 = 0;
	static boolean flag = false;
	public static int fun_recursions_alternatingsum(int[] l){
		if(l.length == 0){
			return 0;
		}
		if(flag == false){res = res + l[p];flag = true;}
		else{res = res - l[p];flag = false;}
		
		// System.out.println(res);
		p++;
		
		if(p == l.length){res1 = res;res = 0; p = 0; flag = false;return res1;}
		fun_recursions_alternatingsum(l);
		return res1;

	}
	public static void main(String[] args) {
		System.out.println(fun_recursions_alternatingsum(new int[]{1,2,3,4}));
	}
}