class 자연수뒤집어배열로만들기 {
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
	  자연수뒤집어배열로만들기.solution(12345);
	}
}

/*
String.valueOf()	: 문자열로 변환
toCharArray()		: 문자열을 문자배열로 변환
*/