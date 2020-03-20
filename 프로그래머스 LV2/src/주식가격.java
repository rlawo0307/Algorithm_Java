class 주식가격 {
    public static int[] solution(int[] prices) {
    	int[] res = new int[prices.length];
    	
    	for(int i=0; i<prices.length; i++)
    		for(int j=i+1; j<prices.length; j++)
    		{
    			res[i]++;
    			if(prices[j] < prices[i])
    				break;
    		}
    	return res;
    }
    
    public static void main(String[] args)
    {
    	int[] arr1 = {1,2,3,2,3};
    	System.out.println(주식가격.solution(arr1));
    }
}