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
import java.util.*;

public class FixMostlyMagicSquare {
	public static int sum(int[] a1){
		int res = 0;
		for(int q : a1){
			res = res + q;
		}
		return res;
	}

	public int[][] fixMostlyMagicSquare(int[][] a) {
		// Your code goes here
		System.out.println(Arrays.toString(a[0]));
		boolean flag = false;
		int s = sum(a[0]);
		if(sum(a[0])!=sum(a[1])){
			s= sum(a[2]);
		}
		int count = 0;
		for(int i = 0 ; i < a.length;i++){
			if(!(s == sum(a[i]))){
				System.out.println("s "+s+"  "+sum(a[i]));
				flag = true;
				break;
			}
			else{
				System.out.println("lkj");
				count++;
			}
			
		}
		System.out.println(flag);
		if(flag == false){
			return a;
		}
		boolean flag1 = 0;
		int s2 = 0;
		for(int j = 0 ; j < a[0].length ; j++){
			
		}
		System.out.println(count);
		return new int[0][0];
	}
}
