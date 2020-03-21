import java.util.*;

class 다리를지나는트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> wait = new LinkedList<Integer>();
        Queue<Integer> onthebridge = new LinkedList<Integer>();
        int res=0, tmp=0;
        
        for(int i : truck_weights)
        	wait.add(i);
        for(int i=0; i<bridge_length; i++)
        	onthebridge.add(0);
        
        while(!wait.isEmpty())
        {
        	for(int i=0; i<bridge_length; i++)
        	{
        		if(!wait.isEmpty())
        		{
	        		tmp -= onthebridge.poll();
	        		if(tmp+wait.peek() <= weight)
	        		{
	        			tmp += wait.peek();
	        			onthebridge.add(wait.poll());
	        		}
	        		else
	        		{
	        			onthebridge.add(0);
	        		}
	        		res++;
        		}
        		else
        			break;
        	}
        }
        return res+bridge_length;
    }
    
    public static void main(String[] args)
    {
    	int a = 100;
    	int b = 100;
    	int[] arr2 = {10,10,10,10,10,10,10,10,10,10};
    	System.out.println(다리를지나는트럭.solution(a,b, arr2));
    }
}