class �ִ��������ּҰ����2 {
  public static int[] solution(int n, int m) {
	  int[] res = new int[2];
	  res[0] = gcd(Math.max(n,m), Math.min(n,m));
	  res[1] = n*m/res[0];
	  
	  return res;
  }
	  
  public static int gcd(int a, int b)
  {
	  if(b == 0)
		  return a;
	  return gcd(b, a%b);
  }
  
  public static void main(String[] args) {
		System.out.println(�ִ��������ּҰ����2.solution(2,5));
	}
}

/*
��Ŭ���� ȣ����
*/