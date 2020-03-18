import java.util.Arrays;

class k번째숫자 {
    public static int[] solution(int[] array, int[][] commands) {
    	int[] res = new int[commands.length];
    	
    	for(int i=0; i<res.length; i++)
    	{
    		int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
    		Arrays.sort(tmp);
    		res[i] = tmp[commands[i][2]-1];
    	}
    	return res;
    }
    
    public static void main(String[] args) {
    	int[] arr1 = {1,5,2,6,3,7,4};
    	int[][] arr2 = {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(k번째숫자.solution(arr1, arr2));
	}
}