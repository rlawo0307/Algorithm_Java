import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class _2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		int res = 0;
		int div = 1;
		for(int i=n.length()-1; i>=0; i--)
		{
			int tmp = n.charAt(i);
			if('0' <= tmp && tmp <= '9')
				tmp -= '0';
			else if('A' <= tmp && tmp <= 'Z')
				tmp -= 'A' - 10;
			
			res += tmp*div;
			div *= b;
		}
		bw.write(res + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}