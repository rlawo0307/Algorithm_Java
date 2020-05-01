import java.util.Scanner;

public class _11576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), m = sc.nextInt();
		int mul = (int)Math.pow(A, m-1);
		int sum = 0;
		StringBuilder res = new StringBuilder();
		
		for(int i=0; i<m; i++)
		{
			sum += sc.nextInt() * mul;
			mul /= A;
		}
		
		while(sum > 0)
		{
			StringBuilder tmp = new StringBuilder();
			tmp.append(sum%B);
			res.append(" " + tmp.reverse());
			sum /= B;
		}
		System.out.println(res.reverse().deleteCharAt(res.length()-1));
	}
}