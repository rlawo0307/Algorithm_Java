import java.util.Scanner;

public class _2167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++)
			for(int j=1; j<=m; j++)
				arr[i][j] = sc.nextInt();
		
		int k = sc.nextInt();
		
		while(k > 0)
		{
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int res = 0;
			
			for(int a = i; a<=x; a++)
				for(int b = j; b<=y; b++)
					res += arr[a][b];
			System.out.println(res);
			
			k--;
		}
	}
}