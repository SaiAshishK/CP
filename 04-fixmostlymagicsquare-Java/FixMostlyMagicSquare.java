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
import java.nio.MappedByteBuffer;
import java.util.*;

public class FixMostlyMagicSquare {
	public static int sum(int[] a1){
		int res = 0;
		for(int q : a1){
			res = res + q;
		}
		return res;
	}
	public int getr(int[][] a,int c){
		for(int i = 0 ; i < a.length ; i++){
			if(sum(a[i]) != c){
				return i;
			}
		}
		return -1;
	}
	public int getc(int[][] a,int c){
		for(int i = 0 ;i < a.length ; i++){
			int r = 0;
			for(int j = 0 ; j < a.length ;j ++){
				r = r + a[j][i];
			}
			if(r != c){
				return i;
			}
		}
		return -1;
	}
	public int[][] fixMostlyMagicSquare(int[][] a) {
		// Your code goes here
		ArrayList<Integer> ar = new ArrayList<Integer>();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < a.length ; i++){
			int c = sum(a[i]);
			if(ar.contains(c)){
				hm.replace(c, hm.get(c)+1);
			}else{
				ar.add(c);
				hm.put(c, 1);
			}
		}
		int p = Integer.MIN_VALUE;
		int res = 0;
		for(Map.Entry<Integer,Integer> e : hm.entrySet()){
			if(e.getValue() > p){
				p = e.getValue();
				res = e.getKey();
			}
		}
		int row = getr(a,res);
		ar.clear();
		hm.clear();
		for(int j = 0; j < a.length ;j++){
			int q = 0;
			for(int k = 0 ; k < a.length ; k++){
				q = q + a[k][j];
			}
			if(ar.contains(q)){
				hm.replace(q, hm.get(q)+1);
			}
			else{
				ar.add(q);
				hm.put(q, 1);
			}
		}
		int p1 = Integer.MIN_VALUE;
		int res1 = 0;
		for(Map.Entry<Integer,Integer> e1 : hm.entrySet()){
			if(e1.getValue() > p1){
				p1 = e1.getValue();
				res1 = e1.getKey();
			}
		}
		int col = getc(a,res1);
		if(col == -1 || row == -1){
			return a;
		}
		int y = sum(a[row]);
		a[row][col ] += res1 - y;

		return a;
	}
}
