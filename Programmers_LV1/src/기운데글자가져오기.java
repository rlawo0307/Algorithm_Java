class 기운데글자가져오기 {
  public static String solution(String s) {	  
	  return s.substring((s.length()-1)/2, s.length()/2+1);
	  
	  /*int mid = (int) s.length() / 2;
	    if(s.length()%2 == 0)
		  return s.substring(mid-1, mid+1);
	  return s.substring(mid, mid+1);
	  */
  }
  
  public static void main(String[] args) {
	  String input = "abcd";
		System.out.println(기운데글자가져오기.solution(input));
	}
}

/*
substring(a, b)		: 인덱스 a부터 인덱스 b전까지 문자열 자르기 
*/