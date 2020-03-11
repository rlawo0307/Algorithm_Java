import java.util.Arrays;

class 제일작은수제거하기 {
  public static int[] solution(int[] arr) {
	  if(arr.length == 1)
	  {
		  arr[0] = -1;
		  return arr;
	  }
	  
	  int[] tmp = arr.clone();
	  Arrays.sort(tmp);
	  int[] res = new int[arr.length-1];
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  if(arr[i] == tmp[0])
		  {
			  for(int j=i+1; j<arr.length; j++)
				  res[j-1] = arr[j];
			  break;
		  }
		  else
			  res[i] = arr[i];
	  }
	  return res;
  }
  
  public static void main(String[] args) {
	  int[] arr = {4};
	  System.out.println(제일작은수제거하기.solution(arr));
	}
}

/*
clone()		: 배열 복사
*/