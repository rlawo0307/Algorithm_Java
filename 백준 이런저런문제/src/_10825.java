import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _10825 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		LinkedList<_10825_Person> list = new LinkedList<_10825_Person>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			list.add(new _10825_Person(name, kor, eng, math));
		}
		Collections.sort(list);
		
		for(_10825_Person tmp : list)
			bw.write(tmp.name + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
class _10825_Person implements Comparable<_10825_Person>
{
	String name;
	int kor;
	int eng;
	int math;
	
	public _10825_Person(String name, int kor, int eng, int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int compareTo(_10825_Person o)
	{
		if(this.kor < o.kor)
			return 1;
		else if(this.kor == o.kor)
		{
			if(this.eng > o.eng)
				return 1;
			else if(this.eng == o.eng)
			{
				if(this.math < o.math)
					return 1;
				else if(this.math == o.math)
					return this.name.compareTo(o.name);	
				else
					return -1;
			}
			else
				return -1;
		}
		else
			return -1;
	}
}