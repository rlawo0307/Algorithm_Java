import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test > 0)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] arr = new int[n][m];
			
			for(int i=0; i<k; i++)
			{
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[y][x] = 1;
			}
			
			System.out.println(bfs(m, n, arr));
			test--;
		}
	}
	
	static int bfs(int m, int n, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		int[][] check = new int[n][m];
		
		int res = 1;
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(arr[i][j] == 1 && check[i][j] == 0)
				{
					check[i][j] = res;
					q_i.add(i);
					q_j.add(j);
					
					while(!q_i.isEmpty())
					{
						int cur_y = (int)q_i.poll();
						int cur_x = (int)q_j.poll();
						
						for(int k=0; k<4; k++)
						{
							int next_x = cur_x + dx[k];
							int next_y = cur_y + dy[k];
							
							if(next_x < 0 || next_x >= m || next_y < 0 || next_y >= n)
								continue;
							if(arr[next_y][next_x] == 0)
								continue;
							if(check[next_y][next_x] != 0)
								continue;
							
							check[next_y][next_x] = check[cur_y][cur_x];
							q_i.add(next_y);
							q_j.add(next_x);
						}
					}
					res++;
				}
		return res-1;
	}
}