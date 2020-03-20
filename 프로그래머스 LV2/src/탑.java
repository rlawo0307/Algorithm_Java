class ž {
    public static int[] solution(int[] heights) {
    	int[] res = new int[heights.length];
    	
    	for(int i=1; i<heights.length; i++)
    		for(int j=i-1; j>-1; j--)
    			if(heights[j] > heights[i])
    			{
    				res[i] = j+1;
    				break;
    			}
    	return res;
    }
    
    public static void main(String[] args)
    {
    	int[] arr1 = {3,3,9,3,5,7,2};
    	System.out.println(ž.solution(arr1));
    }
}