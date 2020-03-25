class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
    	int tmp, res=0;
    	
    	for(String str : skill_trees)
    		for(int i=0; i<str.length(); i++)
    		{
    			tmp = skill.indexOf(str.charAt(i));
    			if(tmp > 0)
    			{
    				String strtmp = str.substring(0, i);
    				if(!strtmp.contains(String.valueOf(skill.charAt(tmp-1))))
    					break;
    			}
    			if(i == str.length()-1)
    				res++;
    		}
    	return res;
    }
    
    public static void main(String[] args)
    {
    	String str1 = "CBD";
    	String[] arr = {"BACDE","CBADF","AECB","BDA"};
    	System.out.println(스킬트리.solution(str1,  arr));
    }
}