
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 3, 5};
		
		quickSort(arr, 0, arr.length-1);
	}
	
	static void quickSort(int arr[], int left, int right)
	{
		if(left < right)
		{
			int pivot = partition(arr, left, right);
			
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}
	
	static int partition(int arr[], int left, int right)
	{
		int pivot = arr[(left + right)/2];
		while(left < right)
		{
			while(arr[left] < pivot && left < right) left++;
			while(arr[right] > pivot && left < right) right--;
			
			swap(arr, left, right);
		}
		return left;
	}
	
	static void swap(int arr[], int left, int right)
	{
		int tmp;
		tmp = arr[left];
		arr[left] = arr[right];
		arr[right]= tmp;
	}
}