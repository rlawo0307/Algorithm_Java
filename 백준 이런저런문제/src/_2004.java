import java.io.*;
import java.util.StringTokenizer;

public class _2004 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long five = Countfive(n) - Countfive(m) - Countfive(n-m);
		long two = Counttwo(n) - Counttwo(m) - Counttwo(n-m);
		
		bw.write(Math.min(five, two) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	static long Countfive(int n)
	{
		long five = 0;
		
		while(n >= 5)
		{
			n /= 5;
			five += n;
		}
		
		return five;
	}
	
	static long Counttwo(int n)
	{
		int two = 0;
		
		while(n >= 2)
		{
			n /= 2;
			two += n;
		}
		return two;
	}
}