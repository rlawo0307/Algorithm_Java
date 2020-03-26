import java.util.Scanner;

public class _11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] num = scanner.next().toCharArray();
		int sum = 0;
		int i;
		
		for(i = 0; i<n-1; i++)
			sum += num[i] - '0';
		sum += Integer.parseInt(String.valueOf(num).substring(i));
		
		System.out.println(sum);
	}
}