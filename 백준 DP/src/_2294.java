import java.util.Scanner;

public class _2294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = new int[k+1][n+1];
		int[] coin = new int[n+1];
		int[] min = new int[k+1];
		
		for(int i=1; i<=n; i++)
			coin[i] = sc.nextInt();
		for(int i=1; i<=k; i++)
			min[i] = 10000;
		
		for(int i=1; i<=k; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i >= coin[j])
				{
					dp[i][j] = min[i-coin[j]] + 1;
					min[i] = Math.min(min[i], dp[i][j]);
				}
				else
					dp[i][j] = -1;
			}
		}
		if(min[k] == 10000)
			System.out.println(-1);
		else
			System.out.println(min[k]);
	}
}