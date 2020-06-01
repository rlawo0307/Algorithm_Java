import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11724 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		
		for(int i=1; i<=m; i++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			arr[start][end] = arr[end][start] = 1;
		}
		for(int i=1; i<=n; i++)
			arr[i][i] = 1;
		
		bfs(n, arr);
	}
	
	static void bfs(int n, int[][] arr)
	{
		Queue<Integer> node = new LinkedList<Integer>();
		int[][] check = new int[n+1][n+1];
		
		int res = 1;
		for(int i=1; i<=n; i++)
			for(int j=1; j<=n; j++)
				if(arr[i][j] == 1 && check[i][j] == 0)
				{
					check[i][j] = check[j][i] = res;
					node.add(j);
					
					while(!node.isEmpty())
					{
						int cur = node.poll();
						
						for(int k=1; k<=n; k++)
							if(arr[cur][k] == 1 && check[cur][k] == 0)
							{
								check[cur][k] = check[k][cur] = res;
								node.add(k);
							}
					}
					res++;
				}
		System.out.println(res-1);
	}

}
