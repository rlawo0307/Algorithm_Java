import java.util.Scanner;

public class _10953 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str;
		for(int i=0; i<n; i++)
		{
			str = scanner.next().split(",");
			System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
		}
	}
}
