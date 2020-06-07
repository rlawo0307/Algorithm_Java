import java.util.Scanner;

public class _1389 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		
		for(int i=0; i<m; i++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			arr[start][end] = arr[end][start] = 1;
		}
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
				if(arr[i][j] == 1)
					dfs(n, i, j, arr, 1);
		}
		
		int res = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
				arr[i][0] += arr[i][j];
			if(arr[i][0] < arr[res][0])
				res = i;
		}

		System.out.println(res);
	}
	
	static void dfs(int n, int start, int cur, int[][] arr, int value)
	{
		for(int i=1; i<=n; i++)
			if(i != start)
				if(arr[cur][i] == 1)
					if(arr[start][i] == 0 || value+1 < arr[start][i])
					{
						arr[start][i] = value+1;
						dfs(n, start, i, arr, value+1);
					}		
	}
}