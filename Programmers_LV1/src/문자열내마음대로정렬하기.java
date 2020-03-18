import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ���ڿ���������������ϱ� {
  public static String[] solution(String[] strings, int n) {
	  ArrayList<String> list = new ArrayList<String>();
	  for(int i=0; i<strings.length; i++)
		  list.add(strings[i]);
	  
	  Collections.sort(list, new Comparator<String>() {
		  public int compare(String str1, String str2)
		  {
			  if(str1.charAt(n) > str2.charAt(n))
				  return 1;
			  else if(str1.charAt(n) < str2.charAt(n))
				  return -1;
			  else
				  return str1.compareTo(str2);
		  }
	  });
	  
	  String[] res = new String[strings.length];
	  for(int i=0; i<res.length; i++)
		  res[i] = list.get(i);
	  for(int i=0; i<res.length; i++)
		  System.out.println(res[i]);
	  return res;
  }
  
  public static void main(String[] args) {
		String[] arr = {"abce","abcd","cdx"};
		System.out.println(���ڿ���������������ϱ�.solution(arr, 2));
	}
}

/*
Collections.sort()	: list �÷��� ��ü�� ����, �̶� 2��° ������ comparator�� �����ϸ� �ش� �Լ��� �������� ���İ���
						default�� comparable �������̽�
*/