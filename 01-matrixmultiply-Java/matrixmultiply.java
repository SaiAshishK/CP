// # Write the function matrixMultiply(m1, m2) that takes two 2d arrays 
// # (that we will consider to be matrices) and returns a new 2d array that 
// # is the result of multiplying the two matrices. Return [[]] if the 
// # two matrices cannot be multiplied for any reason.

class matrixmultiply {
	public int[][] fun_matrixmultiply(int[][] a, int[][] b){
		int[][] arr = {{}};
		int c1 = a[0].length;
		int c2 = b[0].length;
		int r1 = a.length;
		int r2 = b.length;
		if(c1 != r2){
			return arr;
		}
		int[][] res = new int[r1][c2];
		for(int p = 0 ; p < r1; p++){
			for(int q = 0 ; q < c2 ; q++){
				for(int r = 0 ; r < c1 ; r++){
					res[p][q] = res[p][q] + (a[p][r] * b[r][q]);
				}
			}
		}
		return res;
	}
}