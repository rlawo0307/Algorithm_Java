import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _10026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			String tmp = sc.next();
			for(int j=0; j<n; j++)
				if(tmp.charAt(j) == 'R')
					arr[i][j] = 0;
				else if(tmp.charAt(j) == 'G')
					arr[i][j] = 1;
				else
					arr[i][j] = 2;
		}
		
		System.out.printf("%d ", bfs(n, arr, 3));
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
			{
				arr[i][j] -= 3;
				if(arr[i][j] != 0)
					arr[i][j] = arr[i][j]-1;
			}
		System.out.printf("%d\n", bfs(n, arr, 2));
	}
	
	static int bfs(int n, int[][] arr, int type_cnt)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		int res = 0;
		
		for(int type = 0; type<type_cnt; type++)
		{
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					if(arr[i][j] == type)
					{
						res++;
						arr[i][j] = type + type_cnt;
						q_i.add(i);
						q_j.add(j);
					
						while(!q_i.isEmpty())
						{
							int cur_y = q_i.poll();
							int cur_x = q_j.poll();
							
							for(int k=0; k<4; k++)
							{
								int next_y = cur_y + dy[k];
								int next_x = cur_x + dx[k];
								
								if(next_y < 0 || next_y >= n || next_x < 0 || next_x >= n)
									continue;
								if(arr[next_y][next_x] != type)
									continue;
								
								arr[next_y][next_x] = type + type_cnt;
								q_i.add(next_y);
								q_j.add(next_x);
							}
						}
					}
		}
		return res;
	}
	
	static int ab(int n, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		int res = 0;
		
		for(int type = 0; type<2; type++)
		{
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					if(arr[i][j] == type)
					{
						res++;
						arr[i][j] = type + 2;
						q_i.add(i);
						q_j.add(j);
					
						while(!q_i.isEmpty())
						{
							int cur_y = q_i.poll();
							int cur_x = q_j.poll();
							
							for(int k=0; k<4; k++)
							{
								int next_y = cur_y + dy[k];
								int next_x = cur_x + dx[k];
								
								if(next_y < 0 || next_y >= n || next_x < 0 || next_x >= n)
									continue;
								if(arr[next_y][next_x] != type)
									continue;
								
								arr[next_y][next_x] = type + 2;
								q_i.add(next_y);
								q_j.add(next_x);
							}
						}
					}
		}
		return res;
	}
}
