import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2589 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++)
		{
			String tmp = sc.next();
			for(int j=0; j<m; j++)
			{
				char a = tmp.charAt(j);
				if(a == 'W')
					arr[i][j] = 0;
				else
					arr[i][j] = 1;
			}	
		}
		
		int cnt = findLand(n, m, arr);
		int res = findtreasure(n, m, arr, cnt);
		System.out.println(res);
	}
	
	static int findLand(int n, int m, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		int res = 2;
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] == 1)
				{
					arr[i][j] = res;
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
							
							if(next_y < 0 || next_y >= n || next_x < 0 || next_x >= m)
								continue;
							if(arr[next_y][next_x] != 1)
								continue;
							
							arr[next_y][next_x] = res;
							q_i.add(next_y);
							q_j.add(next_x);
						}
					}
					res++;
				}
		return res-2;
	}

	static int findtreasure(int n, int m, int[][] arr, int cnt)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		int res = 0;
		for(int num = 2; num<= cnt+2; num++)
		{
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
					if(arr[i][j] == num)
					{
						int[][] tmp = copyarr(n, m, arr, num);
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
								
								if(next_y < 0 || next_y >= n || next_x < 0 || next_x >= m)
									continue;
								if(tmp[next_y][next_x] != 1)
									continue;
								if(next_y == i && next_x == j)
									continue;
								
								tmp[next_y][next_x] = tmp[cur_y][cur_x] + 1;
								q_i.add(next_y);
								q_j.add(next_x);
								
								res = Math.max(res, tmp[next_y][next_x]);
							}
						}
					}
		}
		return res-1;
	}
	
	static int[][] copyarr(int n, int m, int[][] arr, int num)
	{
		int[][] res = new int[n][m];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] == num)
					res[i][j] = 1;
		return res;
	}
}