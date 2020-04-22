import java.io.*;
import java.util.StringTokenizer;

public class _10942 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		int[][] dp = new int[n+1][n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int j=1; j<=n; j++)
			for(int i=1; i<=j; i++)
				if(i == j)
				{
					dp[i][j] = 1;
				}
				else if(j-i == 1)
				{
					if(arr[j] == arr[i])
						dp[i][j] = 1;
				}
				else
				{
					if(dp[i+1][j-1] == 1 && arr[j] == arr[i])
						dp[i][j] = 1;
				}
		
		int test = Integer.parseInt(br.readLine());
		int[] index = new int[2];
		while(test > 0)
		{
			st = new StringTokenizer(br.readLine(), " ");
			index[0] = Integer.parseInt(st.nextToken());
			index[1] = Integer.parseInt(st.nextToken());
			
			bw.write(dp[index[0]][index[1]] + "\n");
			test--;
		}
		bw.close();
	}
}