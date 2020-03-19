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
HashMap을 Dictionary처럼 사용할 수 있음
맵이름.put()		: 맵에 <key, value>값 입력
맵이름.get()		: key를 통해서 value값 추출
String.valueOf(): 인자를 문자열로 변환
StringBuffer	: StringBilder와 더불어 문자열을 저장하고 관리하는 클래스
				  String 객체는 한번 생성되면 할당된 공간이 변하지 않는다.
				  (+연산 또는 concat()을 통해 다른 문자열을 추가할 경우,
				    원래있던 문자열에 추가되는것이 아니라 Heap영역에 새로운 객체를 생성해 그 객체를 참조하게 함.
				    객체를 참조하는 변수가 없어지면 가비지컬렉터에 의해 수거됨)
				  StringBuffer와 StringBuilder 객체는 변할수 있다.
				  StringBuffer는 멀티쓰레드 환경에서 사용하기 좋고, StringBuilder는 단일쓰레드환경에서 좋다.
*/