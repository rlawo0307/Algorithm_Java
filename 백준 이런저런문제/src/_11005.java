import java.util.Scanner;

public class _11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder res = new StringBuilder();
		
		while(n > 0)
		{
			int tmp = n % b;
			if(tmp < 10)
				res.append((char)(tmp + '0'));
			else
				res.append((char)(tmp + 'A' - 10));
			n /= b;
		}
		System.out.println(res.reverse());
	}
}