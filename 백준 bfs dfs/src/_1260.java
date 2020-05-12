import java.util.*;

public class _1260 {
	
	static int[][] arr;
	static int[] visit;
	static int[] res;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		arr = new int[n+1][n+1];
		visit = new int[n+1];
		res = new int[n];
		
		for(int i=0; i<m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		
		DFS(start, 0);
		
		int i=0;
		System.out.printf("%d", res[i]);
		while(res[++i] != 0)
			System.out.printf(" %d", res[i]);
		System.out.println();
		
		visit = new int[n+1];
		BFS(start);
	}
	
	static void DFS(int prev, int index)
	{
		if(visit[prev] == 1)
			return;
		
		visit[prev] = 1;
		res[index] = prev;
		
		for(int i=1; i<=n; i++)
		{
			if(arr[prev][i] == 1 && visit[i] == 0)
				DFS(i, index+1);
			
			if(res[n-1] != 0)
				return;
		}
	}
	
	static void BFS(int start)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		visit[start] = 1;
		
		while(!q.isEmpty())
		{
			int prev = q.poll();
			System.out.printf("%d ", prev);
			
			for(int j = 1; j <=n; j++)
				if(arr[prev][j] == 1 && visit[j] == 0)
				{
					q.add(j);
					visit[j] = 1;
				}
			
			if(q.size() == 1)
				System.out.println(q.poll());
		}
	}
}