import java.util.Scanner;

public class _10164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int pass = sc.nextInt();
		int dp[][] = new int[n+1][m+1];
		
		int pass_row = pass/m + 1;
		int pass_col = pass % m;
		if(pass == 0)	//pass == 1 과 같은 경우
		{
			pass_row = 1;
			pass_col = 1;
		}
		if(pass_col == 0)
		{
			pass_row -= 1;
			pass_col = m;
		}
		
		for(int i=1; i<=n; i++)
			for(int j=1; j<=m; j++)
				if(i == 1 || j == 1)
					dp[i][j] = 1;
				else if((i==pass_row && j>pass_col) ||
						(i>pass_row && j==pass_col))
					dp[i][j] = dp[pass_row][pass_col];
				else
					dp[i][j] = dp[i][j-1] + dp[i-1][j];
			
		System.out.println(dp[n][m]);
	}
}
