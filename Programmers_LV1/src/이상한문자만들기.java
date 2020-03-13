class 이상한문자만들기 {
  public static String solution(String s) {
	  int sep = 0;
	  char[] strarr = s.toCharArray();
	  for(int i=0; i<strarr.length; i++)
	  {
		  if(strarr[i] == ' ')
		  {
			  sep = i+1;
			  continue;
		  }
		  if((i-sep)%2 == 0 && strarr[i] >= 'a')
		  {
			  strarr[i] -= 32;
		  }
		  else if((i-sep)%2 != 0 && strarr[i] < 'a')
		  {
			  strarr[i] += 32;
		  }
	  }
	  return String.valueOf(strarr);
  }
  
  public static void main(String[] args) {
	  String str = "try hello world";
	  System.out.println(이상한문자만들기.solution(str));
	}
}