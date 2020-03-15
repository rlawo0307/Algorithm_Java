class 두정수사이의합 {
  public static long solution(int a, int b) {
	  long res = 0;
	  for(int i=Math.min(a,b); i<=Math.max(a,b); i++)
		  res += i;
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(두정수사이의합.solution(3, 3));
	}
}