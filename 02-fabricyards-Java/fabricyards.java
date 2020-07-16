// # fabricyards(inches)
// # Fabric must be purchased in whole yards, so purchasing just 1 inch 
// # of fabric requires purchasing 1 entire yard. With this in mind, 
// # write the function fabricYards(inches) that takes the number of 
// # inches of fabric desired, and returns the smallest number of whole 
// # yards of fabric that must be purchased.

// # fabricexcess(inches)
// # Write the function fabricExcess(inches) that takes the number of 
// # inches of fabric desired and returns the number of inches of excess 
// # fabric that must be purchased (as purchases must be in whole yards)
// # . Hint: you may want to use fabricYards, which you just wrote!


class fabricyards {
	public int fun_fabricyards(int inches){
		// your code goes here
		if(inches == 0){
			return 0;
		}
		int d = inches;
		int c =0;
		while(d>0){
			d = d - 36;
			c++;
		}

		return c;
	}

	public int fun_fabricexcess(int inches){
		// your code goes here
		if(inches == 0){
			return 0;
		}
		int d = fun_fabricyards(inches);
		d = d*36;
		return d - inches;
	}
}