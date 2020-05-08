import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class _1168 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=1; i<=n; i++)
			v.add(i);
		
		bw.write("<");
		int now = k-1;
		while(v.size() > 1)
		{
			bw.write(v.remove(now) + ", ");
			now += k-1;
			if(!v.isEmpty())
				now %= v.size();
		}
		bw.write(v.remove(0) + ">");
		bw.flush();
		br.close();
		bw.close();
	}
}