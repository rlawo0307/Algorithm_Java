class ��ձ��ϱ�{
  public static double ��ձ��ϱ�(int[] arr)
  {
	  int sum=0;
	  for(int i=0; i<arr.length; i++)
	  {
		  sum += arr[i];
	  }
	  return (double)sum/arr.length;
  }
  
  public static void main(String[] args) {
	  int[] arr = {5,5};
	  System.out.println(��ձ��ϱ�.��ձ��ϱ�(arr));
	}
}