import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class 문자열내마음대로정렬하기 {
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
		System.out.println(문자열내마음대로정렬하기.solution(arr, 2));
	}
}

/*
Collections.sort()	: list 컬렉션 객체를 정렬, 이때 2번째 인자인 comparator를 지정하면 해당 함수를 기준으로 정렬가능
						default는 comparable 인터페이스
*/