class �ڿ���������迭�θ���� {
  public static int[] solution(long n) {
	  String str = String.valueOf(n);
	  char[] tmp = str.toCharArray();
	  int[] res = new int[tmp.length];
	  for(int i=0; i<tmp.length; i++)
	  {
		  res[i] = tmp[tmp.length-i-1] - '0';
	  }
	  return res;
  }
  
  public static void main(String[] args) {
	  �ڿ���������迭�θ����.solution(12345);
	}
}

/*
String.valueOf()	: ���ڿ��� ��ȯ
toCharArray()		: ���ڿ��� ���ڹ迭�� ��ȯ
*/