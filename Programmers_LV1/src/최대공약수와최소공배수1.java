class �ִ��������ּҰ����1 {
  public static int[] solution(int n, int m) {
	  int min = Math.min(n, m);
	  int max = Math.max(n, m);
	  int tmp = max % min;
	  int tmp2, tmp3 = -1;
	  try
	  {
		  tmp2 = min % tmp;
	  }catch(Exception e)
	  {
		  return new int[] {min, max};
	  };
	  
	 while(tmp2 != 0)
	 {
		 tmp3 = tmp%tmp2;
		 tmp = tmp2;
		 tmp2 = tmp3;
	 }
	 
	 return new int[] {tmp, n*m/tmp};
  }
  
  public static void main(String[] args) {
		System.out.println(�ִ��������ּҰ����1.solution(2,5));
	}
}


/*
��Ŭ���� ȣ����
*/