import java.util.Scanner;
import java.util.Stack;

public class _9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		while(n > 0)
		{
			Stack<String> stack = new Stack<String>();
			String res = "YES";
			String str = sc.nextLine();
			int len = str.length();
			for(int i=0; i<len; i++)
			{
				if(str.charAt(i) == '(')
					stack.push("(");
				else
				{
					if(stack.empty())
					{
						res = "NO";
						break;
					}
					else
						stack.pop();
				}	
			}
			if(!res.equals("NO") && !stack.empty())
				res = "NO";
			System.out.println(res);
			n--;
		}
	}
}