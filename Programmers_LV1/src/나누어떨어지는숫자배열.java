import java.util.ArrayList;
import java.util.Arrays;

class ����������¼��ڹ迭 {
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
		System.out.println(����������¼��ڹ迭.solution(arr, 1));
	}
}