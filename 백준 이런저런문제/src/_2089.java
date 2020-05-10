import java.util.Scanner;

public class _2089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder res = new StringBuilder();
		
		if(n == 0)
			System.out.println(0);
		
		while(n != 0)
		{
			res.append(String.valueOf(Math.abs(n%(-2))));
			n = (int)Math.ceil((double)n / (-2));
		}
		
		System.out.println(res.reverse());
	}
}