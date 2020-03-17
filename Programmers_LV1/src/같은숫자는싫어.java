import java.util.*;

public class 같은숫자는싫어 {
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
		System.out.println(같은숫자는싫어.solution(arr));
	}
}

/*
list.add(value)		: 리스트에 원소 추가
list.size()			: 리스트의 크기(원소의 개수) 리턴
list.get(index)		: 리스트의 i번째 index에 있는 원소 리턴
*/