import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test > 0)
		{
			int n = sc.nextInt();
			int cur_y = sc.nextInt();
			int cur_x = sc.nextInt();
			int end_y = sc.nextInt();
			int end_x = sc.nextInt();
			int[][] arr = new int[n][n];
			
			arr[cur_y][cur_x] = 1;

			bfs(n, arr, end_y, end_x);
			test--;
		}
	}
	
	static void bfs(int n, int[][] arr, int end_y, int end_x)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
		int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
		
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				if(arr[i][j] != 0)
				{
					q_i.add(i);
					q_j.add(j);
					
					while(!q_i.isEmpty())
					{
						int cur_y = q_i.poll();
						int cur_x = q_j.poll();
						
						if(cur_y == end_y && cur_x == end_x)
						{
							System.out.println(arr[cur_y][cur_x]-1);
							return ;
						}
						
						for(int k=0; k<8; k++)
						{
							int next_y = cur_y + dy[k];
							int next_x = cur_x + dx[k];
							
							if(next_y < 0 || next_y >= n || next_x < 0 || next_x >= n)
								continue;
							if(arr[next_y][next_x] != 0)
								continue;
							
							arr[next_y][next_x] = arr[cur_y][cur_x] + 1;
							q_i.add(next_y);
							q_j.add(next_x);
						}
					}
				}
	}
}