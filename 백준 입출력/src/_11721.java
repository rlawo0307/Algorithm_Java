import java.util.Scanner;

public class _11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = 0;
		while(i < str.length())
		{
			String substr = str.substring(i, Math.min(i+10, str.length()));
			System.out.println(substr);
			i = Math.min(i+10, str.length());
		}
	}
}
