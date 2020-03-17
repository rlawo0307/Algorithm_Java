class �Ҽ�ã�� {
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
		System.out.println(�Ҽ�ã��.solution(5));
	}
}

/*
�����佺�׳׽��� ü
: 2���� n������ ���ڸ� ���ʷ� �� ����, 2���� �����Ͽ� ���� �Ҽ�(p=2)�� ���Ͽ� �� ����� ����������.
	�̷��� ������ p�� ������ n���� Ŀ�������� �ݺ��Ѵ�(p^2>=n, p=2,3,...)
	�����ִ� ������ 2���� n���̿� �����ϴ� �Ҽ����̴�
*/ 