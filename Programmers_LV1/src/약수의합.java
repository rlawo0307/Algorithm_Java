class 약수의합 {
  public static int solution(int n) {
	  int res = 0;
	  
	  for(int i=1; i<=Math.sqrt(n); i++)
		  if(n%i == 0)
		  {
			  if(i != Math.sqrt(n))
				  res += n/i;
			  res += i;
		  }
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(약수의합.solution(12));
	}
}