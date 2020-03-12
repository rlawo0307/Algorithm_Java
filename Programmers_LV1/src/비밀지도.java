class 비밀지도 {
  public static String[] solution(int n, int[] arr1, int[] arr2) {
	  String[] res = new String[n];
	  String tmp;
	  for(int i=0; i<n; i++)
	  {
		  tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
		  if(tmp.length() != n)
		  {
			  for(int j=tmp.length(); j<n; j++)
				  tmp = "0".concat(tmp);
		  }
		  res[i] = tmp.replace('1', '#').replace('0', ' ');
	  }
	  return res;
  }
  
  public static void main(String[] args) {
	  int n = 5;
	  int[] arr1 = {0,0,0,0,0};
	  int[] arr2 = {30,1,21,17,28};
	  System.out.println(비밀지도.solution(n, arr1, arr2));
	}
}

/*
Integer.toBinaryString()	: 정수를 2진 문자열로 변환
concat()					: 문자열 이어붙이기
replace()					: 문자 대치
*/