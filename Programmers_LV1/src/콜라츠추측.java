class 콜라츠추측 {
  public static int solution(int num) {
	  long tmp = (long) num;
	  int cnt = 0;
	  
	  if(num == 1)
		  return 0;
	  
	  while(cnt < 500)
	  {
		  if(tmp%2 == 0)
		  {
			  tmp /= 2;
		  }
		  else
		  {
			  tmp *= 3;
			  tmp += 1;
		  }
		  cnt++;
		  if(tmp == 1)
			  return cnt;
	  }
	  return -1;
  }
  
  public static void main(String[] args) {
		System.out.println(콜라츠추측.solution(1));
	}
}