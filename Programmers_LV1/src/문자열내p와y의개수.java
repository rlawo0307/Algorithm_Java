class ���ڿ���p��y�ǰ��� {
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
  		System.out.println(���ڿ���p��y�ǰ���.solution(arr));
  	}
}

/*
s = s.toUpperCase();
return s.chars().filter(e->'P' == e).count() == s.chars().filter(e->'Y' == e).count()

chars()		: ���ڿ��� Stream���� ��ȯ (Stream - ���ٸ� Ȱ���� �� �ִ� ��)
filter()	: Stream �� ��ҵ��� �ϳ��� ���ؼ� �ɷ���
count()		: �ش� Stream�� ����� ������ ����
*/