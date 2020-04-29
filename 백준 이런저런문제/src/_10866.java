import java.io.*;
import java.util.*;

public class _10866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Deque<Integer> dq = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		while(n > 0)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			int arg = 0;
			if(st.hasMoreTokens())
				arg = Integer.parseInt(st.nextToken());
			
			if(command.equals("push_front"))
			{
				dq.offerFirst(arg);
			}
			else if(command.equals("push_back"))
			{
				dq.offerLast(arg);
			}
			else if(command.equals("pop_front"))
			{
				int tmp = -1;
				if(!dq.isEmpty())
					tmp = dq.pollFirst();
				bw.write(tmp + "\n");
			}
			else if(command.equals("pop_back"))
			{
				int tmp = -1;
				if(!dq.isEmpty())
					tmp = dq.pollLast();
				bw.write(tmp + "\n");
			}
			else if(command.equals("size"))
			{
				bw.write(dq.size() + "\n");
			}
			else if(command.equals("empty"))
			{
				int flag = 0;
				if(dq.isEmpty())
					flag = 1;
				bw.write(flag + "\n");
			}
			else if(command.equals("front"))
			{
				int tmp = -1;
				if(!dq.isEmpty())
					tmp = dq.peekFirst();
				bw.write(tmp + "\n");
			}
			else if(command.equals("back"))
			{
				int tmp = -1;
				if(!dq.isEmpty())
					tmp = dq.peekLast();
				bw.write(tmp + "\n");
			}
			bw.flush();
			n--;
		}
		br.close();
		bw.close();
	}
}