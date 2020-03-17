class 소수찾기 {
  public static int solution(int n) {
	  int[] num = new int[n+1];
	  int res=0;
	  
	  for(int i=2; i*i<=n; i++)
		  for(int j=i; j<num.length; j+=i)
		  {
			  if(i == j)
				  continue;
			  if(num[j] == 0)
				  num[j] = 1;
		  }
	  for(int i=2; i<num.length; i++)
		  if(num[i] == 0)
			  res ++;
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(소수찾기.solution(5));
	}
}

/*
에라토스테네스의 체
: 2부터 n까지의 숫자를 차례로 쓴 다음, 2부터 시작하여 지울 소수(p=2)를 정하여 그 배수를 지워나간다.
	이러한 과정을 p의 제곱이 n보다 커질때까지 반복한다(p^2>=n, p=2,3,...)
	남아있는 수들이 2부터 n사이에 존재하는 소수들이다
*/ 