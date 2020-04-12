import java.util.Scanner;

public class _1890 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		long[][] dp = new long[n+1][n+1];
		
		for(int i=1; i<=n; i++)
			for(int j=1; j<=n; j++)
				arr[i][j] = sc.nextInt();
		
		dp[1][1] = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				for(int k=1; k<i; k++)
					if(arr[k][j] == i-k && dp[k][j] != 0)
						dp[i][j] += dp[k][j];
				
				for(int k=1; k<j; k++)
					if(arr[i][k] == j-k && dp[i][k] != 0)
						dp[i][j] += dp[i][k];
			}
		}
		System.out.println(dp[n][n]);
	}
}