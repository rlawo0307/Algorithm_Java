import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++)
		{
			String tmp = sc.next();
			for(int j=1; j<=m; j++)
				arr[i][j] = tmp.charAt(j-1) - '0';
		}
		
		bfs(n, m, arr);
	}
	
	static void bfs(int n, int m, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[][] check = new int[n+1][m+1];
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		
		check[1][1] = 1;
		q_i.add(1);
		q_j.add(1);
		
		while(!q_i.isEmpty())
		{
			int cur_y = q_i.poll();
			int cur_x = q_j.poll();
			
			for(int i=0; i<4; i++)
			{
				int next_x = cur_x + dx[i];
				int next_y = cur_y + dy[i];
				
				if(next_x < 0 || next_x > m || next_y < 0 || next_y > n)
					continue;
				if(arr[next_y][next_x] == 0)
					continue;
				if(check[next_y][next_x] != 0)
					continue;
				
				check[next_y][next_x] = check[cur_y][cur_x] + 1;
				q_i.add(next_y);
				q_j.add(next_x);
			}
		}
		System.out.println(check[n][m]);
	}
}