import java.util.Arrays;

class k¹øÂ°¼ýÀÚ {
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
		System.out.println(k¹øÂ°¼ýÀÚ.solution(arr1, arr2));
	}
}

/*
Arrays.copyOfRange()	: 범위를 지정하여 배열 복사
*/
