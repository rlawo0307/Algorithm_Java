class 올바른괄호 {
    static boolean solution(String s) {
    	int cnt = 0;
    	
    	for(int i=0; i<s.length(); i++)
    	{
    		if(s.charAt(i) == '(')
    			cnt++;
    		else
    			cnt--;
    		if(cnt < 0)
    			break;
    	}
    	
    	if(cnt == 0)
    		return true;
    	else
    		return false;
    }
    
    public static void main(String[] args)
    {
    	String str = "()))((()";
    	System.out.println(올바른괄호.solution(str));
    }
}