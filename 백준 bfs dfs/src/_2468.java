import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2468 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int max = 1;
		int min = 100;
		
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
				max = Math.max(max, arr[i][j]);
				min = Math.min(min, arr[i][j]);
			}
		
		int res = 0;
		for(int tmp=min-1; tmp<=max; tmp++)
		{
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					if(arr[i][j] <= tmp)
						arr[i][j] = 0;
			
			Queue<Integer> q_i = new LinkedList<Integer>();
			Queue<Integer> q_j = new LinkedList<Integer>();
			int[][] check = new int[n][n];
			int[] dy = {-1, 1, 0, 0};
			int[] dx = {0, 0, -1, 1};
			int cnt = 1;
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					if(arr[i][j] != 0 && check[i][j] == 0)
					{
						check[i][j] = 1;
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
								if(arr[next_y][next_x] == 0)
									continue;
								if(check[next_y][next_x] != 0)
									continue;
								
								check[next_y][next_x] = 1;
								q_i.add(next_y);
								q_j.add(next_x);
							}
						}
						cnt++;
					}
			res = Math.max(res, cnt-1);
		}
		System.out.println(res);
	}
}