import java.util.Scanner;

public class _11055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		int res = -1;
		
		for(int i=1; i<=n; i++)
			arr[i] = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			dp[i] = arr[i];
			for(int j=1; j<i; j++)
				if(arr[i] > arr[j])
					dp[i] = Math.max(dp[i], dp[j]+arr[i]);
			res = Math.max(res, dp[i]);
		}
		System.out.println(res);
	}
}