import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		bfs(n, k);
	}
	
	static void bfs(int n, int k)
	{
		int[] arr = new int[100001];
		Queue q = new LinkedList<Integer>();
		
		q.add(n);

		while(!q.isEmpty())
		{
			int cur = (int)q.poll();
			
			if(cur == k)
			{
				System.out.println(arr[cur]);
				return ;
			}
			
			for(int i=0; i<3; i++)
			{
				int next;
				if(i == 0)
					next = cur-1;
				else if(i == 1)
					next = cur+1;
				else
					next = cur+cur;
				
				if(next < 0 || next > 100000)
					continue;
				
				if(arr[next] == 0)
				{
					q.add(next);
					arr[next] = arr[cur]+1;
				}
			}
		}
	}
}