import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class _10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Queue<Integer> q = new LinkedList<Integer>();
		int last = 0;
		
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
				q.add(arg);
				last = arg;
			}
			else if(command.equals("pop"))
			{
				int tmp = -1;
				if(!q.isEmpty())
					tmp = q.poll();
				bw.write(tmp + "\n");
			}
			else if(command.equals("size"))
			{
				bw.write(q.size() + "\n");
			}
			else if(command.equals("empty"))
			{
				int flag = 0;
				if(q.isEmpty())
					flag = 1;
				bw.write(flag + "\n");
			}
			else if(command.equals("front"))
			{
				int tmp = -1;
				if(!q.isEmpty())
					tmp = q.peek();
				bw.write(tmp + "\n");
			}
			else if(command.equals("back"))
			{
				int tmp = -1;
				if(!q.isEmpty())
					tmp = last;
				bw.write(tmp + "\n");
			}
			bw.flush();
			n--;
		}
		br.close();
		bw.close();
	}
}