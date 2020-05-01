import java.util.Scanner;

public class _6588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while((num = sc.nextInt()) != 0)
		{
			int res = 0;
			for(int i=2; i<=num/2; i++)
			{
				boolean flag = true;
				for(int j=2; j<=Math.sqrt(i); j++)
					if(i%j == 0)
						flag = false;
				
				if(flag)
				{
					int tmp = num-i;
					for(int j=2; j<=Math.sqrt(tmp); j++)
						if(tmp%j == 0)
							flag = false;
					if(flag)
					{
						res = i;
						break;
					}
				}
			}
			if(res == num || res == 0)
				System.out.println("Goldbach's conjecture is wrong.");
			else
				System.out.printf("%d = %d + %d\n", num, res, num-res);
		}
	}
}