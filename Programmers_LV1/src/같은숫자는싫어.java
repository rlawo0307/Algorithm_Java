import java.util.*;

public class �������ڴ½Ⱦ� {
	public static int[] solution(int []arr) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		int pre = 10;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != pre)
			{
				pre = arr[i];
				list.add(pre);
			}
		}
		
		int[] res = new int[list.size()];
		
		for(int i=0; i<res.length; i++)
			res[i] = list.get(i);
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(�������ڴ½Ⱦ�.solution(arr));
	}
}

/*
list.add(value)		: ����Ʈ�� ���� �߰�
list.size()			: ����Ʈ�� ũ��(������ ����) ����
list.get(index)		: ����Ʈ�� i��° index�� �ִ� ���� ����
*/