import java.util.*;
class QuickSort {
	int start = 0;
	int end = 0;
	int p1 = 0;
	public int[] quicksort(int[] arr){
		// Your code goes here
		if(p1 == 0){
		end = arr.length-1;
		p1++;}
		if(start < end){
			int p = part(arr, start, end);
			part(arr, start, p-1);
			part(arr,p+1,end);
		}
		return arr;

	}
	public int part(int[] arr, int lo, int hi){
		int pivot = lo;
		while(true){
			while(arr[lo] <= arr[pivot]){
				lo++;
			}
			while(arr[hi] >= arr[pivot]){
				System.out.println("+");
				hi--;
			}
			if(lo > hi){
				arr = swap(pivot,hi,arr);
				System.out.println(Arrays.toString(arr));
				System.out.println(lo+" "+hi);
				return hi;
			}
			arr = swap(lo,hi,arr);
		}
	}
	public int[] swap(int start,int end,int[] arr){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		return arr;
	}
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		// System.out.println(Arrays.toString(q.quicksort(new int[]{4,7,1,2,9,6,10,3})));
		System.out.println(Arrays.toString(q.quicksort(new int[]{21, 4, 1, 3, 9, 20, 25, 6, 21, 14})));
	}

}