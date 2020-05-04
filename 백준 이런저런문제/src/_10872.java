import java.io.*;

public class _10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int res = 1;
		while(n > 1)
		{
			res *= n;
			n--;
		}
		bw.write(res + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}