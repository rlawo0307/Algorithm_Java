import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _3055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		int hedge_i = -1, hedge_j = -1;
		int end_i = -1, end_j = -1;
		
		for(int i=0; i<r; i++)
		{
			String tmp = sc.next();
			for(int j=0; j<c; j++)
			{
				char a = tmp.charAt(j);
			
				if(a == 'S') // °í½¿µµÄ¡
				{
					hedge_i = i;
					hedge_j = j;
				}
				else if(a == 'D') // ºñ¹öÀÇ ±¼
				{
					end_i = i;
					end_j = j;
				}
				else if(a == '*') // ¹°
					arr[i][j] = 1;
				else if(a == 'X') // µ¹
					arr[i][j] = -1;
			}
		}
		
		water(r, c, arr, end_i, end_j);
		hedge(r, c, arr, hedge_i, hedge_j, end_i, end_j);
	}
	
	static void water(int r, int c, int[][] arr, int end_i, int end_j)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				if(arr[i][j] == 1)
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
							
							if(next_y < 0 || next_y >= r || next_x < 0 || next_x >= c)
								continue;
							if(next_y == end_i && next_x == end_j)
								continue;
							if(arr[next_y][next_x] != 0)
								if(arr[next_y][next_x] <= arr[cur_y][cur_x] + 1)
									continue;
							
							arr[next_y][next_x] = arr[cur_y][cur_x] + 1;
							q_i.add(next_y);
							q_j.add(next_x);
						}
					}	
				}
	}

	static void hedge(int r, int c, int[][] arr, int hedge_i, int hedge_j, int end_i, int end_j)
	{
		Queue<Integer> q_i = new LinkedList<Integer>();
		Queue<Integer> q_j = new LinkedList<Integer>();
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		
		q_i.add(hedge_i);
		q_j.add(hedge_j);
		arr[hedge_i][hedge_j] = 1;
		
		while(!q_i.isEmpty())
		{
			int cur_y = q_i.poll();
			int cur_x = q_j.poll();
			
			if(cur_y == end_i && cur_x == end_j)
			{
				System.out.println(arr[end_i][end_j]-1);
				return ;
			}
			
			for(int k=0; k<4; k++)
			{
				int next_y = cur_y + dy[k];
				int next_x = cur_x + dx[k];
				
				if(next_y < 0 || next_y >= r || next_x < 0 || next_x >= c)
					continue;
				if(arr[next_y][next_x] != 0)
					if(arr[next_y][next_x] <= arr[cur_y][cur_x] + 1)
						continue;
				
				arr[next_y][next_x] = arr[cur_y][cur_x] + 1;
				q_i.add(next_y);
				q_j.add(next_x);
			}
		}
		System.out.println("KAKTUS");
	}
}