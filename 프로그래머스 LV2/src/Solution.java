import java.util.HashMap;
import java.util.Map;

class Solution {
  public static String solution(int n) {
	  String res = "";
	  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	  int mok = 1, na = 1;
	  
	  map.put(1, 1);
	  map.put(2, 2);
	  map.put(0, 4);
	  
	  while(mok != 0)
	  {
		  mok = n/3;
		  na = n%3;
		  if(na == 0)
			  mok--;
		  res += String.valueOf(map.get(na));
		  n = mok;
	  }
      return new StringBuffer(res).reverse().toString();
  }
  
  public static void main(String[] args)
  {
	  System.out.println(Solution.solution(40));
  }
}

/*
HashMap�� Dictionaryó�� ����� �� ����
���̸�.put()		: �ʿ� <key, value>�� �Է�
���̸�.get()		: key�� ���ؼ� value�� ����
String.valueOf(): ���ڸ� ���ڿ��� ��ȯ
StringBuffer	: StringBilder�� ���Ҿ� ���ڿ��� �����ϰ� �����ϴ� Ŭ����
				  String ��ü�� �ѹ� �����Ǹ� �Ҵ�� ������ ������ �ʴ´�.
				  (+���� �Ǵ� concat()�� ���� �ٸ� ���ڿ��� �߰��� ���,
				    �����ִ� ���ڿ��� �߰��Ǵ°��� �ƴ϶� Heap������ ���ο� ��ü�� ������ �� ��ü�� �����ϰ� ��.
				    ��ü�� �����ϴ� ������ �������� �������÷��Ϳ� ���� ���ŵ�)
				  StringBuffer�� StringBuilder ��ü�� ���Ҽ� �ִ�.
				  StringBuffer�� ��Ƽ������ ȯ�濡�� ����ϱ� ����, StringBuilder�� ���Ͼ�����ȯ�濡�� ����.
*/