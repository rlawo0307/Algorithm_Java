import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++)
			for(int j=0;j <m; j++)
				arr[i][j] = sc.nextInt();
		
		int res = bfs(n, m, arr);
		System.out.println(res);
	}
	
	static int bfs(int n, int m, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		int res = 0;
		int mass = 1;
		while(mass < 2)
		{
			res++;
			int[][] check = copyarr(n, m, arr);
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
					if(arr[i][j] != 0)
					{
						for(int k=0; k<4; k++)
						{
							int check_y = i + dy[k];
							int check_x = j + dx[k];
							
							if(check_y < 0 || check_y >= n || check_x < 0 || check_x >= m)
								continue;
							if(check[check_y][check_x] != 0)
								continue;
							
							arr[i][j] = Math.max(0, arr[i][j]-1);
						}
					}
			boolean zero = true;
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
					if(arr[i][j] != 0)
						zero = false;
			if(zero)
				return 0;
			
			int cnt = 0;
			int[][] tmp = new int[n][m];
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
					if(arr[i][j] != 0 && tmp[i][j] == 0)
					{
						cnt++;
						tmp[i][j] = cnt;
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
								
								if(next_y < 0 || next_y >=n || next_x < 0 || next_x >= m)
									continue;
								if(arr[next_y][next_x] == 0)
									continue;
								if(tmp[next_y][next_x] != 0)
									continue;
								
								tmp[next_y][next_x] = cnt;
								q_i.add(next_y);
								q_j.add(next_x);
							}
						}
					}
			mass = cnt;
		}
		return res;
	}
	
	static int[][] copyarr(int n, int m, int[][] arr)
	{
		int[][] res = new int[n][m];
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				res[i][j] = arr[i][j];
		return res;
	}

}
