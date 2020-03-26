import java.util.Scanner;

public class _2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<= 2*n-1; i++)
		{
			if(i <= n)
			{
				for(int j=0; j<i-1; j++)
					System.out.print(" ");
				for(int j=0; j<2*(n-i+1)-1; j++)
					System.out.print("*");
				System.out.println();
			}
			else
			{
				for(int j=0; j<2*n-i-1; j++)
					System.out.print(" ");
				for(int j=0; j<(i-n)*2+1; j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}