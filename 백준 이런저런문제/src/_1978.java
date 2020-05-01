import java.util.Scanner;

public class _1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		
		while(n > 0)
		{
			int num = sc.nextInt();
			if(num != 1)
			{
				boolean flag = true;
				for(int i=2; i<=Math.sqrt(num); i++)
					if(num%i == 0)
						flag = false;
				if(flag)
					res++;
			}
			n--;
		}
		System.out.println(res);
	}
}