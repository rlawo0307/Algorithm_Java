import java.util.Scanner;

public class _1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp1 = a, tmp2 = b;
			
			int res = 1;
			for(int i=2; i<=a; i++)
				while(tmp1%i == 0 && tmp2%i == 0)
				{
					res *= i;
					tmp1 /= i;
					tmp2 /= i;
				}
			System.out.printf("%d\n", res*(a/res)*(b/res));
			n--;
		}
	}
}