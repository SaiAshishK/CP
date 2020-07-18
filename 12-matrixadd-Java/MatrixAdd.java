// matrixAdd(L, M)[10 pts]
// Background: we can think of a 2d list in Python as a matrix in math. To add two matrices, L and M, they must have 
// the same dimensions. 
// Then, we loop over each row and col, and the result[row][col] is just the sum of L[row][col] and M[row][col]. For example:
// L = [ [1,  2,  3],
//       [4,  5,  6] ]
// M = [ [21, 22, 23],
//       [24, 25, 26]]
// N = [ [1+21, 2+22, 3+23],
//       [4+24, 5+25, 6+26]]
// assert(matrixAdd(L, M) == N)
// With this in mind, write the function matrixAdd(L, M) that takes two rectangular 2d lists (that we will consider 
// to be matrices) that you 
// may assume only contain numbers, and returns a new 2d list that is the result of adding the two matrices. Return 
// None if the two matrices 
// cannot be added because they are of different dimensions.
import java.util.*;

public class MatrixAdd {
	public static int[][] matrixAdd(int[][] L, int[][] M) {
		int[][] res = new int[L.length][L[0].length];
		if(L.length == M.length && L[0].length == M[0].length && L[1].length == M[1].length){
			for(int  i = 0 ;i < L.length ; i++){
				for(int j = 0 ; j < L[0].length ; j++){
					res[i][j] = L[i][j] + M[i][j];
				}
			}
			return res;
		}
		else{
			return null;
		}
		// your code goes here
		// return new int[0][0];
	}
	public static void main(String[] args) {
		int[][] re = matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}}, new int[][]{{21, 22, 23}, {24, 25}});
		System.out.println(Arrays.toString(re[0]));
	}
}