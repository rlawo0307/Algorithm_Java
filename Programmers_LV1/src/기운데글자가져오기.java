class �����ڰ������� {
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
		System.out.println(�����ڰ�������.solution(input));
	}
}

/*
substring(a, b)		: �ε��� a���� �ε��� b������ ���ڿ� �ڸ��� 
*/