// isMostlyMagicSquare(a) [15 pts]
// Write the function isMostlyMagicSquare(a) that takes an 2d list of numbers, which you may assume is an NxN square 
// with N>0, and returns True if it is "mostly magic" and False otherwise, where a square is "mostly magic" if:
// Each row, each column, and each of the 2 diagonals each sum to the same total.
// A completely magic square has additional restrictions (such as not allowing duplicates, and only allowing numbers 
// from 1 to N2), which we are not enforcing here, but which you can read about here. Note: any magic square is also 
// a "mostly magic" square, including this sample magic square:
// Read for more: https://en.wikipedia.org/wiki/Magic_square
// Here is another mostly-magic square:
// [ [ 42 ]]
// That square is 1x1 and each row, column, and diagonal sums to 42! And finally, here is a not-mostly-magic square:
// [ [ 1, 2],
//   [ 2, 1]]
// Each row and each column add to 3, but one diagonal adds to 2 and the other to 4.

public class IsMostlyMagicSquare {
	public boolean isMostlyMagicSquare(int[][] a) {
		// Your code goes here
		int l = a.length;
		int p  =sum(a[0]);
		for(int i = 0 ; i < l; i++){
			if(p != sum(a[i])){
				return false;
			}
		}
		int c = 0;
		int res1 = 0;
		int res2 = 0;
		for(int q = 0 ; q < l ; q++){
			res1 = res1  + a[q][c];
			res2 = res2 + a[q][q];
		}
		for(int j = 0 ;j < l ; j ++){
			int r1 = 0;
			for(int k = 0; k < l ; k++){
				r1 = r1 + a[k][j];
			}
			if(r1 != res1){
				return false;
			}
		}
		int w = l-1;
		int r2 = 0;
		for(int b = 0 ; b < l ; b++){
				r2 = r2 + a[w--][b];
			}
		if(res2 != r2){
			return false;
		}
		return true;
	}
	public int sum(int[] a){
		int res = 0;
		for(int j : a){
			res = res + j;
		}
		return res;
	}
}
