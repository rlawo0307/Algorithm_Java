import java.util.ArrayList;
import java.util.Arrays;

class 나누어떨어지는숫자배열 {
  public static int[] solution(int[] arr, int divisor) {
	  ArrayList<Integer> list = new ArrayList<>();
	  int[] res = {};
	  
	  for(int i=0; i<arr.length; i++)
		  if(arr[i]%divisor == 0)
			  list.add(arr[i]);
	  
	  res = list.stream().mapToInt(i -> i).toArray();
	  if(res.length == 0)
		  return new int[] {-1};
	  Arrays.sort(res);
	  for(int i=0; i<res.length; i++)
		  System.out.println(res[i]);
	  return res;
  }
  
  public static void main(String[] args) {
	  int[] arr = {2,36,1,3};
		System.out.println(나누어떨어지는숫자배열.solution(arr, 1));
	}
}