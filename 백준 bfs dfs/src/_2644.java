import java.util.Scanner;

public class _2644 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		
		for(int i=0; i<m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		
		for(int i=1; i<=n; i++)
			if(arr[start][i] == 1)
				relative(n, arr, start, i, 1);
		if(arr[start][end] == 0)
			System.out.println(-1);
		else
			System.out.println(arr[start][end]);
	}
	
	static void relative(int n, int[][] arr, int start, int cur, int value)
	{
		for(int i=1; i<=n; i++)
			if(arr[cur][i] == 1 && arr[start][i] == 0 && i != start)
			{
				arr[start][i] = value+1;
				relative(n, arr, start, i, value+1);
			}
	}
}
