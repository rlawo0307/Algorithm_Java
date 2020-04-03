import java.util.Scanner;

public class _2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i=1; i<=n; i++)
			arr[i] = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i == 1)
				dp[1] = arr[1];
			else if(i == 2)
				dp[2] = arr[1]+arr[2];
			else if(i == 3)
				dp[3] = Math.max(arr[1], arr[2]) + arr[3];
			else
				dp[i] = Math.max(dp[i-3]+arr[i-1], dp[i-2])+arr[i];
		}
		System.out.println(dp[n]);
	}
}