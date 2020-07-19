class BinarySearch {
	public int binary_search(int[] arr, int value){
        // Your code goes here
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == value){
                        return count;
                }
                count++;
        }
        return -1;
	}
}