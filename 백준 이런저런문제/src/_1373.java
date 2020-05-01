import java.util.*;

public class _1373 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder res = new StringBuilder();
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++)
			stack.push((int)(str.charAt(i) - '0'));
		
		while(!stack.empty())
		{
			int tmp = 0;
			int mul = 1;
			int cnt = 0;
			while(!stack.empty() && cnt < 3)
			{
				tmp += stack.pop() * mul;
				mul *= 2;
				cnt++;
			}
			res.append(tmp);
		}
		System.out.println(res.reverse());
	}
}