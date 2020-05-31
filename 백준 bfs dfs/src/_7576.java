import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7576 {
	static int[][] arr;
	static int m, n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		arr = new int[n][m];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				arr[i][j] = sc.nextInt();
		
		bfs();
	}
	
	static void bfs()
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] == 1)
				{
					q_i.add(i);
					q_j.add(j);
				}
		
		while(!q_i.isEmpty())
		{
			int x = (int)q_i.poll();
			int y = (int)q_j.poll();
			
			for(int i=0; i<4; i++)
			{
				int next_x = x + dx[i];
				int next_y = y + dy[i];
			
				if(next_x < 0 || next_x >= n || next_y < 0 || next_y >= m)
					continue;
				if(arr[next_x][next_y] != 0)
					continue;
				
				arr[next_x][next_y] = arr[x][y] + 1;
				q_i.add(next_x);
				q_j.add(next_y);
			}
		}
		
		int res = 0;
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
			{
				if(arr[i][j] == 0)
				{
					System.out.println(-1);
					return ;
				}
				
				res = Math.max(res, arr[i][j]);
			}
		
		System.out.println(res-1);
	}
}