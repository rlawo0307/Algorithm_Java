import java.util.Scanner;

public class _2096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][3];
		int[][] max = new int[n+1][3];
		int[][] min = new int[n+1][3];
		
		for(int i=1; i<=n; i++)
			for(int j=0; j<3; j++)
				arr[i][j] = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j == 0)
				{
					min[i][j] = Math.min(min[i-1][j], min[i-1][j+1]) + arr[i][j];
					max[i][j] = Math.max(max[i-1][j], max[i-1][j+1]) + arr[i][j];
				}
				else if(j == 1)
				{
					min[i][j] += Math.min(Math.min(min[i-1][j-1], min[i-1][j]), min[i-1][j+1]) + arr[i][j];	
					max[i][j] += Math.max(Math.max(max[i-1][j-1], max[i-1][j]), max[i-1][j+1]) + arr[i][j];	
				}
				else
				{
					min[i][j] += Math.min(min[i-1][j-1], min[i-1][j]) + arr[i][j];
					max[i][j] += Math.max(max[i-1][j-1], max[i-1][j]) + arr[i][j];
				}
			}
		}
		
		System.out.printf("%d %d\n", Math.max(Math.max(max[n][0], max[n][1]), max[n][2]), Math.min(Math.min(min[n][0], min[n][1]), min[n][2]));
	}
}