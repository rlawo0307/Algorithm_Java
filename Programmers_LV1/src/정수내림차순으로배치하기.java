import java.util.Arrays;

class ���������������ι�ġ�ϱ� {
  public static long solution(long n) {
	  String str = String.valueOf(n);
	  char[] tmp = str.toCharArray();
	  long res = 0;
	 
	  Arrays.sort(tmp);
	  for(int i=0; i<tmp.length; i++)
	  {
		  res += tmp[tmp.length-i-1] - '0';
		  if(i != tmp.length-1)
			  res *= 10;
	  }
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(���������������ι�ġ�ϱ�.solution(118372));
	}
}

/*
String.valueOf()	: ���ڿ��� ��ȯ
toCharArray()		: ���ڿ��� ���ڹ迭�� ��ȯ
Arrays.sort()		: �迭�� ������������ ����
*/