import java.util.*;

public class �ڸ������ϱ� {
    public static int �ڸ������ϱ�(int n) {
    	String res = String.valueOf(n);
    	int sum=0;
    	for(int i=0; i<res.length(); i++)
    	{
    		sum += res.charAt(i) - '0';
    	}
    	return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(�ڸ������ϱ�.�ڸ������ϱ�(987));
	}
}

/*
String.valueOf()	: ���ڿ��� ��ȯ
charAt()			: i��° �ε����� ���� ���
*/
