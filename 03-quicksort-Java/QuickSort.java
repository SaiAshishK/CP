import java.util.*;
class QuickSort {

	public int[] quicksort(int[] arr){
		// Your code goes here
		int start = 0;
		int end = arr.length-1;
		Sort(arr, start, end);
		return arr;

	}

    public int[] Sort(int[] arr, int low, int high){
		// System.out.println(Arrays.toString(arr));
        if (low < high)
        {
            int pi = partition(arr, low, high);
            Sort(arr, low, pi - 1);
			Sort(arr, pi + 1, high);
			
		}
        return arr;
        
    }
	public int partition(int[] arr, int low , int high){
		int pivot = arr[high];  
		int i = (low - 1);
		for (int j = low; j <= high- 1; j++)
		{
			// System.out.println(arr[j]+"  "+pivot);
			if (arr[j] < pivot)
			{
				i++;
				// System.out.println("swap1 "+arr[i]+"  "+arr[j]);
				swap(arr, i, j);
			}
		}
		// System.out.println("swap2 "+arr[i+1]+"  "+arr[high]);
		swap(arr, i+1, high);
		return (i + 1);
	}

	public int[] swap(int[] arr , int x1 , int y1){
		int temp = arr[x1];
		arr[x1] = arr[y1];
		arr[y1] = temp;
		return arr;
	}
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		System.out.println(Arrays.toString(q.quicksort(new int[]{21, 4, 1, 3, 9, 20, 25, 6, 21, 14})));
	}

}