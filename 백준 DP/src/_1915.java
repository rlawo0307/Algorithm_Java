import java.util.Scanner;

public class _1915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][m+1];
		int[][] dp = new int[n+1][m+1];
		
		sc.nextLine();
		for(int i=1; i<=n; i++)
		{
			char[] tmp = sc.nextLine().toCharArray();
			for(int j=1; j<=m; j++)
				arr[i][j] = tmp[j-1] - '0';
		}
		
		int res = 0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				if(arr[i][j] == 1 && arr[i-1][j-1] != 0)
				{
					int k=1;
					for(; k<=dp[i-1][j-1]; k++)
						if(arr[i][j-k] == 0 || arr[i-k][j] == 0)
							break;
					
					dp[i][j] = k;
				}
				else
					dp[i][j] = arr[i][j];
				
				res = Math.max(res, dp[i][j]);
			}
		}
		System.out.println(res*res);
	}
}