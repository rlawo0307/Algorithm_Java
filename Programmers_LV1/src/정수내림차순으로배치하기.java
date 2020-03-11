import java.util.Arrays;

class 정수내림차순으로배치하기 {
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
		System.out.println(정수내림차순으로배치하기.solution(118372));
	}
}

/*
String.valueOf()	: 문자열로 변환
toCharArray()		: 문자열을 문자배열로 변환
Arrays.sort()		: 배열을 오름차순으로 정렬
*/