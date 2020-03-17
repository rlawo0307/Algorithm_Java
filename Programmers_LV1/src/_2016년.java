class _2016³â {
  public static String solution(int a, int b) {
	  int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
	  String[] str = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	  int daysum = 0;
	  
	  for(int i=0; i<a-1; i++)
		  daysum += days[i];
	  daysum += b;
	  
	  return str[daysum%7];
  }
  
  public static void main(String[] args) {
		System.out.println(_2016³â.solution(5,24));
	}
}