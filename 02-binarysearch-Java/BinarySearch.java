class BinarySearch {
        static int lo = 0;
        static int hi = 0;
	static int mid = 0;
	static int count = 0;
        public int binary_search(int[] arr, int value){
        // Your code goes here
                if(count == 0){
                        hi = arr.length-1;
                        count++;
                }
                mid = (hi + lo)/2;
                if(lo == hi  && arr[mid] != value){
                        return -1;
                }
                if(arr[mid] == value){
                        hi = 0;
                        int mid1 = mid;
                        mid = 0;
                        count = 0;
                        lo = 0;
                        return mid1;
                }
                else if(arr[mid] < value){
                        lo = mid + 1;
                        return binary_search(arr, value);
                }
                else{
                        hi = mid -1;
                        return binary_search(arr, value);
                }
        }
}
