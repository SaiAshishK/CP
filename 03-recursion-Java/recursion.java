class recursion {
	int p1 = 0;
	int p2 = 1;
	int p3 = 0;
	public int get_fib(int value){
		value--;
		if(value > 0){
			p3 = p1 + p2;
			p1 = p2;
			p2 = p3;
			get_fib(value-1);
		}

	    return p3; 
	}
}