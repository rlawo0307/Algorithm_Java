class ���ڼ��ڼ��ڼ��� {
  public static String solution(int n) {
	  String str = "����";
	  String res = "";
	  for(int i=0; i<(n+1)/2; i++)
		  res += str;
	  
	  res = res.substring(0, n);
	  return res;
  }
  
  public static void main(String[] args) {
		System.out.println(���ڼ��ڼ��ڼ���.solution(3));
	}
}