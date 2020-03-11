class 핸드폰번호가리기 {
  public static String 핸드폰번호가리기(String phone_number) {
	  StringBuilder str = new StringBuilder(phone_number);
	  for(int i=0; i<phone_number.length()-4; i++)
	  {
		  str.setCharAt(i, '*');
	  }
      return str.toString();
  }
  
	public static void main(String[] args) {
		System.out.println(핸드폰번호가리기.핸드폰번호가리기("0277778888"));
	}
}

/*
toCharArray()		: 문자열을 문자배열로 전환하기
String.valueOf()	: 문자열로 전환하기
StringBuilder	클래스
	- setCharAt()	: i번째 인덱스의 문자를 특정값으로 치환
	- toString()	: StringBuilder 객체를 String 객체로 변환
*/