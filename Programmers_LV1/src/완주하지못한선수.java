import java.util.Arrays;

class �����������Ѽ��� {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        for(i=0; i<completion.length; i++)
        	if(completion[i].compareTo(participant[i]) != 0)
        		// completion[i].equals(participant[i])
        		return participant[i];
        return participant[i];
    }
    
    public static void main(String[] args) {
		String[] arr1 = {"leo","kiki","eden"};
		String[] arr2 = {"eden","kiki"};
		System.out.println(�����������Ѽ���.solution(arr1, arr2));
	}
}

/*
str1.compareTo(str2)	: str1�� str2�� ��Һ�, ������ 0, str1�� �� ũ�� 1, str2�� �� ũ�� -1dmf flxjs
str1.equals(str2)		: str1�� str2�� ������ �˻�, ������ true, �ٸ��� false ����
*/