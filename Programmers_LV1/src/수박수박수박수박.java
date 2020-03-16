class 수박수박수박수박 {
  public static String solution(int n) {
	  String str = "수박";
	  String res = "";
	  for(int i=0; i<(n+1)/2; i++)
		  res += str;
	  
	  res = res.substring(0, n);
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(수박수박수박수박.solution(3));
	}
}