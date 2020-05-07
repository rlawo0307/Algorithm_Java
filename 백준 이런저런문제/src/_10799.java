import java.io.*;
import java.util.Stack;

public class _10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		Stack<String> stack = new Stack<String>();
		int res = 0;
		char tmp = ' ';
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == '(')
				stack.add("(");
			else
			{
				if(tmp == '(')	//laser
					res += stack.size()-1;
				else
					res += 1;
				stack.pop();
			}
			tmp = str.charAt(i);
		}
		bw.write(res + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}