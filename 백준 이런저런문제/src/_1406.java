import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class _1406 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Stack<String> leftstack = new Stack<String>();
		Stack<String> rightstack = new Stack<String>();
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<str.length(); i++)
			leftstack.add(String.valueOf(str.charAt(i)));
		
		while(n > 0)
		{
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if(command.equals("L"))
			{
				if(!leftstack.isEmpty())
					rightstack.add(leftstack.pop());
			}
			if(command.equals("D"))
			{
				if(!rightstack.isEmpty())
					leftstack.add(rightstack.pop());
			}
			if(command.equals("B"))
			{
				if(!leftstack.isEmpty())
					leftstack.pop();
			}
			if(command.equals("P"))
			{
				String arg = st.nextToken();
				leftstack.add(arg);
			}
			n--;
		}
		
		StringBuilder res = new StringBuilder();
		while(!leftstack.isEmpty())
			res.append(leftstack.pop());
		res.reverse();
		while(!rightstack.isEmpty())
			res.append(rightstack.pop());
		
		bw.write(String.valueOf(res));
		bw.flush();
		br.close();
		bw.close();
	}
}