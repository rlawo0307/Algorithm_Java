class �����������Ǻ� {
  public static long solution(long n) {
	  double tmp = Math.sqrt(n);
	  if(tmp%1 == 0)
		  return (long) Math.pow(tmp+1, 2);
	  else
		  return -1;
  }
  
  public static void main(String[] args) {
		System.out.println(�����������Ǻ�.solution(121));
	}
}

/*
Math.sqrt()		: ������ ���ϱ�
Math.pow()		: �ŵ����� ���ϱ�
*/