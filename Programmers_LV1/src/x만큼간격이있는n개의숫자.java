class x��ŭ�������ִ�n���Ǽ��� {
  public static long[] solution(int x, int n) {
      long[] res = new long[n];
      res[0] = x;
      for(int i=1; i<n; i++)
    	  res[i] = res[i-1]+x;
      return res;
  }
  
  public static void main(String[] args) {
		System.out.println(x��ŭ�������ִ�n���Ǽ���.solution(-4,2));
	}
}