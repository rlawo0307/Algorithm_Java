class ���ڿ��ٷ��⺻ {
  public static boolean solution(String s) {
	  if(s.length() == 4 || s.length() == 6)
	  {
		  try
		  {
			  Integer.parseInt(s);
			  return true;
		  }catch(NumberFormatException e) {
			  return false;
		  }
	  }
	  return false;
  }
  
  public static void main(String[] args) {
		System.out.println(���ڿ��ٷ��⺻.solution("12345"));
	}
}