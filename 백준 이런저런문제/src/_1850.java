import java.io.*;
import java.util.StringTokenizer;

public class _1850 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		int res = 1;
		for(int i=2; i<=Math.min(10000000/res, Math.min(a, b)); i++)
		{
			while(a%i == 0 && b%i == 0)
			{
				res *= i;
				a /= i;
				b /= i;
			}
		}
		
		StringBuilder str = new StringBuilder();
		for(int i=0; i<res; i++)
			str.append("1");
		
		bw.write(String.valueOf(str));
		bw.flush();
		br.close();
		bw.close();
	}
}
