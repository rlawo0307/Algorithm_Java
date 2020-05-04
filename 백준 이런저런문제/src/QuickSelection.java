
public class QuickSelection {

	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 3, 5, 7, 8, 0};
		int k = 5;
		
		QuickSelection(arr, 0, arr.length-1, k);
		
		for(int i=0; i<arr.length; i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		System.out.println(arr[k]);
	}

	static void QuickSelection(int[] arr, int start, int end, int k)
	{
		while(start < end)
		{
			int i = start;
			int j = end;
			int mid = arr[(i+j)/2];
			
			while(i < j)
			{
				if(arr[i] >= mid)
				{
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
					j--;
				}
				else
					i++;
			}
				
			if(arr[i] > mid)
				i--;
			
			if(k <= i)
				end = i;
			else
				start = i+1;
		}
	}
}