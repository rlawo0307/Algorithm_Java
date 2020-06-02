import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _14502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int res;
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				arr[i][j] = sc.nextInt();
		
		res = selectwall(n, m, arr);
		System.out.println(res);
	}
	
	static int selectwall(int n, int m, int[][] original)
	{
		int res = 0;
		
		for(int i=0; i<n*m; i++)
		{
			int[][] arr = copy_arr(n, m, original);
			int y1 = (int)i/m;
			int x1 = i%m;
			if(arr[y1][x1] == 0)
			{
				arr[y1][x1] = 1;
				for(int j=i+1; j<n*m; j++)
				{
					int y2 = (int)j/m;
					int x2 = j%m;
					if(arr[y2][x2] == 0)
					{
						arr[y2][x2] = 1;
						for(int k=j+1; k<n*m; k++)
						{
							int y3 = (int)k/m;
							int x3 = k%m;
							if(arr[y3][x3] == 0)
							{
								arr[y3][x3] = 1;
								
								bfs_virus(n, m, arr);
								res = Math.max(res, calsafe(n, m, arr));
								retrieve(n, m, arr);
								
								arr[y3][x3] = 0;
							}
						}
						arr[y2][x2] = 0;
					}
				}
				arr[y1][x1] = 0;
			}
		}
		return res;
	}
	
	static void bfs_virus(int n, int m, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] == 2)
				{
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
							if(arr[next_y][next_x] != 0)
								continue;
							
							arr[next_y][next_x] = 3;
							q_i.add(next_y);
							q_j.add(next_x);
						}
					}
				}
	}

	static int calsafe(int n, int m, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		int res = 0;
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] == 0)
				{
					res++;
					arr[i][j] = 4;
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
							if(arr[next_y][next_x] != 0)
								continue;
							
							res++;
							arr[next_y][next_x] = 4;
							q_i.add(next_y);
							q_j.add(next_x);
						}
					}
				}
		return res;
	}
	
	static int[][] copy_arr(int n, int m, int[][] arr)
	{
		int[][] res = new int[n][m];
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				res[i][j] = arr[i][j];
		return res;
	}

	static void retrieve(int n, int m, int[][] arr)
	{
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] > 2)
					arr[i][j] = 0;
	}
}
