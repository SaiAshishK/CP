// # carry less addition means a  normal addition with the carry from each column ignored. 
// # So, for example, if we carryless-ly add 8+7, we get 5 (ignore the carry). And if we add 
// # 18+27, we get 35 (still ignore the carry). With this in mind, write the function 
// # fun_carrylessadd(x, y) that takes two non-negative integers x and y and returns their 
// # carryless sum. As the paper demonstrates, fun_carrylessadd(785, 376) returns 51.

import java.lang.Math; 
public class carrylessadd {
	public static int fun_carrylessadd(int x, int y) {
		if(x == 0 || y == 0){
			if(x == 0){
				return y;
			}
			else{return x;}
		}
		int res = 0;
		int p1 = 1;
		while(x != 0 || y != 0){
			int p = x%10;
			x= x-p;
			x = x/10;

			int q = y%10;
			y = y-q;
			y = y/10;
			int r = p + q;
			r = r%10;
			res = res  + r*p1;
			p1 *= 10;
		}
		return res;
	}
}
