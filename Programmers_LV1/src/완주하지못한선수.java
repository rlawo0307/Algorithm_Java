import java.util.Arrays;

class 완주하지못한선수 {
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
		System.out.println(완주하지못한선수.solution(arr1, arr2));
	}
}

/*
str1.compareTo(str2)	: str1과 str2의 대소비교, 같으면 0, str1이 더 크면 1, str2가 더 크면 -1dmf flxjs
str1.equals(str2)		: str1과 str2가 같은지 검사, 같으면 true, 다르면 false 리턴
*/