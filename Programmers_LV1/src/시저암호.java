class 시저암호 {
  public static String solution(String s, int n) {
	  char[] arr = s.toCharArray();
	  
	  for(int i=0; i<arr.length; i++)
		  if(arr[i] != ' ')
		  {
			  arr[i] += n;
			  if((arr[i] > 'Z' && arr[i]-n < 'a') || (arr[i] > 'z') )
				  arr[i] -= 26;
		  }
	  
	  return String.valueOf(arr);
  }
  
  public static void main(String[] args) {
	  String str = "a B z";
		System.out.println(시저암호.solution(str, 4));
	}
}