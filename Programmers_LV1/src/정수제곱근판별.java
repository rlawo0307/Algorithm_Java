class 정수제곱근판별 {
  public static long solution(long n) {
	  double tmp = Math.sqrt(n);
	  if(tmp%1 == 0)
		  return (long) Math.pow(tmp+1, 2);
	  else
		  return -1;
  }
  
  public static void main(String[] args) {
		System.out.println(정수제곱근판별.solution(121));
	}
}

/*
Math.sqrt()		: 제곱근 구하기
Math.pow()		: 거듭제곱 구하기
*/