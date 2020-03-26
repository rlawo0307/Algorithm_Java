import java.util.Scanner;

public class _11022 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a, b;
		
		for(int i=0; i<n; i++)
		{
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
		}
	}
}
