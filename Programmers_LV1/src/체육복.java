class Ã¼À°º¹ {
    public static int solution(int n, int[] lost, int[] reserve) {
    	int[] have = new int[n+2];
    	int res = n-lost.length;
    	
    	for(int i : lost)
    		have[i]--;
    	for(int i : reserve)
    	{
    		if(have[i] == -1)
    			res++;
    		have[i]++;
    	}
    	for(int i=1; i<=n; i++)
    		if(have[i] == -1)
    			if(have[i-1] == 1)
    			{
    				res++;
    				have[i]++;
    				have[i-1]--;
    			}
    			else if(have[i+1] == 1)
    			{
    				res++;
    				have[i]++;
    				have[i+1]--;
    			}
    	return res;
    }
    
    public static void main(String[] args) {
    	int[] arr1 = {2,30};
    	int[] arr2 = {2};
		System.out.println(Ã¼À°º¹.solution(30,arr1, arr2));
	}
}