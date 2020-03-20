import java.util.*;

class ��ɰ��� {
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
    	System.out.println(��ɰ���.solution(arr1, arr2));
    }
}

/*
Math.ceil()		: �ø�
ť�̸�.add()		: ť�� ���� ����
ť�̸�.isEmpty()	: ť�� ����ִ��� �˻�. ��������� 1, �ƴϸ� 0�� ����
ť�̸�.peek()		: ť�� 0��° index�� ����Ǿ��ִ� ���� Ȯ��
ť�̸�.poll()		: ť�� 0��° index�� ����Ǿ��ִ� ���� ����
*/