import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _10814 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		LinkedList<_10814_Persion> list = new LinkedList<_10814_Persion>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			list.add(new _10814_Persion(age, name, i));
		}
		Collections.sort(list);
		
		for(_10814_Persion tmp : list)
			bw.write(tmp.age + " " + tmp.name + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
class _10814_Persion implements Comparable<_10814_Persion>
{
	int age;
	String name;
	int seq;
	
	public _10814_Persion(int age, String name, int i)
	{
		this.age = age;
		this.name = name;
		this.seq = i;
	}

	@Override
	public int compareTo(_10814_Persion o)
	{
		if(this.age > o.age)
			return 1;
		else if(this.age == o.age)
		{
			if(this.seq > o.seq)
				return 1;
			else if(this.seq == o.seq)
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}
}