import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class _1158 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++)
			q.add(i);
		
		bw.write("<");
		while(!q.isEmpty())
		{
			for(int i=0; i<k-1; i++)
				q.add(q.poll());
			
			bw.write(String.valueOf(q.poll()));
			if(q.size() != 0)
				bw.write(", ");
		}
		bw.write(">");
		bw.flush();
		br.close();
		bw.close();
	}
}