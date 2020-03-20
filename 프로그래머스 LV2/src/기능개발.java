import java.util.*;

class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	List<Integer> list = new ArrayList<Integer>();
    	int tmp, res;
    	
    	for(int i=0; i<progresses.length; i++)
    		q.add((int)Math.ceil((100-progresses[i])/(double)speeds[i]));
    	
    	while(!q.isEmpty())
    	{
    		res = 1;
    		tmp = q.poll();
    		while(!q.isEmpty() && tmp >= q.peek())
    		{
    			res++;
    			q.poll();
    		}
    		list.add(res);
    	}
    	return list.stream().mapToInt(i->i.intValue()).toArray();
    }
    
    public static void main(String[] args)
    {
    	int[] arr1 = {93,30,55};
    	int[] arr2 = {1,30,5};
    	System.out.println(기능개발.solution(arr1, arr2));
    }
}

/*
Math.ceil()		: 올림
큐이름.add()		: 큐에 값을 넣음
큐이름.isEmpty()	: 큐가 비어있는지 검사. 비어있으면 1, 아니면 0을 리턴
큐이름.peek()		: 큐의 0번째 index에 저장되어있는 값을 확인
큐이름.poll()		: 큐의 0번째 index에 저장되어있는 값을 꺼냄
*/