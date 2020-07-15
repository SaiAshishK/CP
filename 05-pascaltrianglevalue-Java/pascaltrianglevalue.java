// # Write the function pascalsTriangleValue(row, col) 
// # that takes int values row and col, and returns the 
// # value in the given row and column of Pascal's 
// # Triangle where the triangle starts at row 0, and 
// # each row starts at column 0. If either row or col 
// # are not legal values, return None, instead of crashing. 

class pascaltrianglevalue {
	public int fun_pascaltrianglevalue(int row, int col){
		// your code goes here
		if(row == 0 || col == 0 || row==1){
			return 1;
		}
		else if(col > row+1){
			return 0;
		}
		else{
			return combi(row,col);
		}
		
	}
	public int combi(int n,int r){
		int p1 = factorial(n);
		int p2 = factorial(r);
		int p3 = factorial(n-r);

		return p1/(p2 * p3);
	}

	public int factorial(int q){
		int r = 1;
		while(q!=1){
			r = r * q;
			q--;
		}
		return r;
	}
	
}