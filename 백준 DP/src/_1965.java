import java.util.Scanner;

public class _1965 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i=1; i<=n; i++)
			arr[i] = sc.nextInt();
		
		int res = 0;
		dp[1] = 1;
		for(int i=2; i<=n; i++)
		{
			int max = 0;
			for(int j=1; j<i; j++)
				if(arr[i] > arr[j])
					max = Math.max(max, dp[j]);
			dp[i] = max + 1;
			res = Math.max(res, dp[i]);
		}
		System.out.println(res);
	}
}