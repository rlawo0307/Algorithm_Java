import java.util.Arrays;

class 예산 {
  public static int solution(int[] d, int budget) {
	  int res = 0;
	  int sum = 0;
	  
	  Arrays.sort(d);
	  for(int i=0; i<d.length; i++)
	  {
		if(sum+d[i] > budget)
			return res;
		res++;
		sum += d[i];
	  }
	  return res;
  }
  
  public static void main(String[] args) {
	  int[] arr = {2,2,3,3};
		System.out.println(예산.solution(arr, 10));
	}
}