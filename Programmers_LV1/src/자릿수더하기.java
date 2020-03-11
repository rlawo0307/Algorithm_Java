import java.util.*;

public class 자릿수더하기 {
    public static int 자릿수더하기(int n) {
    	String res = String.valueOf(n);
    	int sum=0;
    	for(int i=0; i<res.length(); i++)
    	{
    		sum += res.charAt(i) - '0';
    	}
    	return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(자릿수더하기.자릿수더하기(987));
	}
}

/*
String.valueOf()	: 문자열로 변환
charAt()			: i번째 인덱스의 문자 얻기
*/
