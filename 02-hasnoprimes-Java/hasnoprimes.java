// # Write the function hasnoprimes(int[][] arr) that takes a 2d array arr of integers, 
// # and returns True if arr does not contain any primes, and False otherwise.


class hasnoprimes {

	public static boolean isPrime(int n) {
		if(n <=1){
			return false;
		}
		for(int i = 2; i < n;i++){
			if(n%i == 0){
				return false;
			}
			
		}
		return true;
	}
	public boolean fun_hasnoprimes(int[][] arr){
		for(int p = 0 ; p < arr.length ; p++){
			for(int q = 0 ; q < arr[p].length ; q++){
				if(isPrime(arr[p][q]) == true){return false;}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(4));
	}
}