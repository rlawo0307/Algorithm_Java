import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		while(n > 0)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			int arg = 0;
			if(st.hasMoreTokens())
				arg = Integer.parseInt(st.nextToken());
			
			if(command.equals("push"))
			{
				stack.push(arg);
			}
			else if(command.equals("pop"))
			{
				int tmp = -1;
				if(!stack.empty())
					tmp = stack.pop();
				bw.write(tmp + "\n");
			}
			else if(command.equals("size"))
			{
				int size = stack.size();
				bw.write(size + "\n");
			}
			else if(command.equals("empty"))
			{
				int flag = 0;
				if(stack.empty())
					flag = 1;
				bw.write(flag + "\n");
			}
			else if(command.equals("top"))
			{
				int tmp = -1;
				if(!stack.empty())
					tmp = stack.peek();
				bw.write(tmp + "\n");
			}
			bw.flush();
			n--;
		}
		br.close();
		bw.close();
	}
}