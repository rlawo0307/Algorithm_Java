import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Collections;

public class _11650 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		LinkedList<_11650_Xy> list = new LinkedList<_11650_Xy>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new _11650_Xy(x, y));
		}
		Collections.sort(list);
		
		for(_11650_Xy tmp : list)
			bw.write(tmp.x + " " + tmp.y + "\n");
		
		bw.flush();
		br.close();
		bw.close();	
	}
}
class _11650_Xy implements Comparable<_11650_Xy>
{
	int x, y;
	public Xy(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(_11650_Xy p)
	{
		if(this.x > p.x)
			return 1;
		else if(this.x == p.x)
		{
			if(this.y > p.y)
				return 1;
			else if(this.y == p.y)
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}
}
