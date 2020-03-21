import java.util.*;

class ¼è¸·´ë±â {
    public static int solution(String arrangement) {
    	Stack<String> st = new Stack<String>();
    	char[] str = arrangement.toCharArray();
    	int res = 0;
    	
    	for(int i=0; i<str.length; i++)
    	{
    		if(str[i] == '(')
    			st.add(String.valueOf(str[i]));
    		else
    		{
    			st.pop();
    			if(str[i-1] == '(')
    				res += st.size();
    			else
    				res++;
    		}
    	}
    	return res;
    }
    
    public static void main(String[] args)
    {
    	String str = "()(((()())(())()))(())";
    	System.out.println(¼è¸·´ë±â.solution(str));
    }
}