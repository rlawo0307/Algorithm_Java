class Æò±Õ±¸ÇÏ±â{
  public static double Æò±Õ±¸ÇÏ±â(int[] arr)
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
	  System.out.println(Æò±Õ±¸ÇÏ±â.Æò±Õ±¸ÇÏ±â(arr));
	}
}