class Çà·ÄÀÇµ¡¼À {
  public static int[][] solution(int[][] arr1, int[][] arr2) {
	  int[][] res = new int[arr1.length][arr1[0].length];
	  for(int i=0; i<arr1.length; i++)
	  {
		  for(int j=0; j<arr1[0].length; j++)
		  {
			  res[i][j] = arr1[i][j]+arr2[i][j];
		  }
	  }
      return res;
  }
  
  public static void main(String[] args) {
	  int[][] arr1 = {{1,2}, {2,3}};
	  int[][] arr2 = {{3,4}, {5,6}};
		System.out.println(Çà·ÄÀÇµ¡¼À.solution(arr1, arr2));
	}
}