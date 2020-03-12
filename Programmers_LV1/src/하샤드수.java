class ÇÏ»þµå¼ö {
  public static boolean solution(int x) {
	  int sum =0;
	  String str = String.valueOf(x);
	  char[] tmp = str.toCharArray();
	  for(int i=0; i<tmp.length; i++)
		  sum += tmp[i] - '0';
	  if(x%sum == 0)
		  return true;
	  return false;
  }
  
  public static void main(String[] args) {
		System.out.println(ÇÏ»þµå¼ö.solution(10));
	}
}