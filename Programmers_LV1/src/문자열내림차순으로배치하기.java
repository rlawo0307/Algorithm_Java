import java.util.Arrays;
import java.util.Collections;

class ���ڿ������������ι�ġ�ϱ� {
  public static String solution(String s) {
	  String[] arr = s.split(""); 
	  Arrays.sort(arr, Collections.reverseOrder());
	  return String.join("", arr);
}
  
  public static void main(String[] args) {
	  String str = "Zbcdefg";
		System.out.println(���ڿ������������ι�ġ�ϱ�.solution(str));
	}
}

/*
spilt(������)		: �����ڸ� �������� ���ڿ��� �߶� ���ڿ� �迭�� ��ȯ
Collections.reverseOrder()	: ������������ �����ϴ� Comparator(���ı���)
								��ȯ���� ��ȯ������ ��ü
String.join(������)			: �����ڸ� �������� (��ȯ������)��ü���� �̾� �ٿ��� ���ڿ��� ��ȯ
*/