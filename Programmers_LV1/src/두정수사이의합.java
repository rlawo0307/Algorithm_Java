class �������������� {
  public static long solution(int a, int b) {
	  long res = 0;
	  for(int i=Math.min(a,b); i<=Math.max(a,b); i++)
		  res += i;
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(��������������.solution(3, 3));
	}
}