import java.io.*;

public class _1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int res = 0;
		
		while(n >= 5)
		{
			n /= 5;
			res += n;
		}
		
		bw.write(res + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}