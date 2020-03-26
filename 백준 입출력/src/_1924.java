import java.util.Scanner;

public class _1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] res = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int month = sc.nextInt();
		int day = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<month; i++)
			sum += days[i];
		sum += day;
		
		System.out.println(res[sum%7]);
	}
}
