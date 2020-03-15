class 문자열내p와y의개수 {
    static boolean solution(String s) {    	
    	char[] strarr = s.toCharArray();
    	int p=0, y=0;
    	for(int i=0; i<s.length(); i++)
    	{
    		if(strarr[i] == 'p' || strarr[i] == 'P')
    			p++;
    		else if(strarr[i] == 'y' || strarr[i] == 'Y')
    			y++;
    	}
    	
    	if(p == y)
    		return true;
    	return false;
    }
    
    public static void main(String[] args) {
    	String arr = "pPoooyY";
  		System.out.println(문자열내p와y의개수.solution(arr));
  	}
}

/*
s = s.toUpperCase();
return s.chars().filter(e->'P' == e).count() == s.chars().filter(e->'Y' == e).count()

chars()		: 문자열을 Stream으로 변환 (Stream - 람다를 활용할 수 있는 형)
filter()	: Stream 내 요소들을 하나씩 평가해서 걸러냄
count()		: 해당 Stream의 요소의 갯수를 리턴
*/