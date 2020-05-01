import java.util.Scanner;

public class _1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=m; i<=n; i++)
		{
			if(i != 1)
			{
				boolean flag = true;
				for(int j=2; j<=Math.sqrt(i); j++)
					if(i%j == 0)
					{
						flag = false;
						break;
					}
				if(flag)
					System.out.println(i);
			}
		}
	}
}