import java.util.Scanner;

public class _2522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp;
		
		for(int i=1; i<=2*n-1; i++)
		{
			if(i <= n)
				tmp = i;
			else
				tmp = 2*n-i;
			
			for(int j=0; j<n-tmp; j++)
				System.out.print(" ");
			for(int j=0; j<tmp; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}