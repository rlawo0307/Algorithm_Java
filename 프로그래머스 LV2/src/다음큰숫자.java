class ����ū���� {
  public static int solution(int n) {
	  int tmp = Integer.bitCount(n);
	  
	  while(true)
	  {
		  if(Integer.bitCount(n+1) == tmp)
			  return n+1;
		  n++;
	  }
  }
  
  public static void main(String[] args)
  {
  	System.out.println(����ū����.solution(15));
  }
}