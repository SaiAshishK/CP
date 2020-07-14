// # Write the function nearestBusStop(street) that takes a 
// # non-negative int street number, and returns the nearest 
// # bus stop to the given street, where buses stop every 8th street, 
// # including street 0, and ties go to the lower street, 
// # so the nearest bus stop to 12th street is 8th street, 
// # and the nearest bus stop to 13 street is 16th street.

class nearestbusstop {
	public int fun_nearestbusstop(int street){
		// your code goes here
		int res = street/8;
		res = res*8;
		int res2 = res+8;
		if(street%8>4){
			return res2;
		}
		else{
			return res;
		}

		// return -1;
	}
}