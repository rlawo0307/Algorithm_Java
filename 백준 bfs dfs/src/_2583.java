import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i=0; i<k; i++)
		{
			int start_x = sc.nextInt();
			int end_y = m - sc.nextInt();
			int end_x = sc.nextInt();
			int start_y = m - sc.nextInt();
			
			for(int j=start_y; j<end_y; j++)
				for(int l=start_x; l<end_x; l++)
					arr[j][l] = 1;
		}
		
		bfs(n, m, arr);
	}
	
	static void bfs(int n, int m, int[][] arr)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		int res = 2;
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				if(arr[i][j] == 0)
				{
					arr[i][j] = res;
					q_i.add(i);
					q_j.add(j);
					int cnt = 1;
					
					while(!q_i.isEmpty())
					{
						int cur_y = q_i.poll();
						int cur_x = q_j.poll();
						
						for(int k=0; k<4; k++)
						{
							int next_y = cur_y + dy[k];
							int next_x = cur_x + dx[k];
							
							if(next_y < 0 || next_y >= m || next_x < 0 || next_x >= n)
								continue;
							if(arr[next_y][next_x] != 0)
								continue;
							
							arr[next_y][next_x] = res;
							q_i.add(next_y);
							q_j.add(next_x);
							cnt++;
						}
					}
					tmp.add(cnt);
					res++;
				}
		int[] list = new int[tmp.size()];
		for(int i=0; i<list.length; i++)
			list[i] = tmp.remove(0);
		Arrays.sort(list);
			
		System.out.println(res-2);
		for(int i=0; i<list.length; i++)
			System.out.printf("%d ", list[i]);
	}
}