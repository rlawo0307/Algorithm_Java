import java.util.Arrays;
import java.util.Collections;

class 문자열내림차순으로배치하기 {
  public static String solution(String s) {
	  String[] arr = s.split(""); 
	  Arrays.sort(arr, Collections.reverseOrder());
	  return String.join("", arr);
}
  
  public static void main(String[] args) {
	  String str = "Zbcdefg";
		System.out.println(문자열내림차순으로배치하기.solution(str));
	}
}

/*
spilt(구분자)		: 구분자를 기준으로 문자열을 잘라서 문자열 배열로 반환
Collections.reverseOrder()	: 내림차순으로 정렬하는 Comparator(정렬기준)
								반환값은 순환가능한 객체
String.join(구분자)			: 구분자를 기준으로 (순환가능한)객체들을 이어 붙여서 문자열로 반환
*/