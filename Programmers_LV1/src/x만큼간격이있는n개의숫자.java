class x만큼간격이있는n개의숫자 {
  public static long[] solution(int x, int n) {
      long[] res = new long[n];
      res[0] = x;
      for(int i=1; i<n; i++)
    	  res[i] = res[i-1]+x;
      return res;
  }
  
  public static void main(String[] args) {
		System.out.println(x만큼간격이있는n개의숫자.solution(-4,2));
	}
}