import java.util.Scanner;

public class _9252 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int[][] dp = new int[str2.length()+1][str1.length()+1];
		
		for(int i=1; i<=str2.length(); i++)
			for(int j=1; j<=str1.length(); j++)
				if(str2.charAt(i-1) == str1.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				
		String res = "";
		int value = dp[str2.length()][str1.length()];
		int end = str1.length()+1;
		for(int i=str2.length(); i>0; i--)
			for(int j=end-1; j>0; j--)
				if(str2.charAt(i-1) == str1.charAt(j-1) && dp[i][j] == value)
				{
					res += str2.charAt(i-1);
					end = j;
					value--;
					break;
				}

		System.out.println(dp[str2.length()][str1.length()]);
		if(dp[str2.length()][str1.length()] != 0)
			System.out.println(new StringBuffer(res).reverse().toString());
	}
}