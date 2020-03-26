import java.util.Scanner;


public class _10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 1000000, max = -1000000;
		
		for(int i=0; i<n; i++)
		{
			int tmp = sc.nextInt();
			if(tmp < min)
				min = tmp;
			if(tmp > max)
				max = tmp;
		}
		System.out.printf("%d %d\n", min, max);
	}
}
