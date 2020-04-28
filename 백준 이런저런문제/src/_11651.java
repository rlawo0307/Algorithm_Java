import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		LinkedList<_11651_Xy> list = new LinkedList<_11651_Xy>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new _11651_Xy(x, y));
		}
		Collections.sort(list);
		
		for(_11651_Xy tmp : list)
			bw.write(tmp.x + " " + tmp.y + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
class _11651_Xy implements Comparable<_11651_Xy>
{
	int x, y;
	public _11651_Xy(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(_11651_Xy o) {
		if(this.y > o.y)
			return 1;
		else if(this.y == o.y)
		{
			if(this.x > o.x)
				return 1;
			else if(this.x == o.x)
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}
}