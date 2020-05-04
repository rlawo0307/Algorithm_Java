import java.io.*;

public class _11653 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int div = 2;
		while(n > 1)
		{
			if(n%div == 0)
			{
				bw.write(div + "\n");
				n /= div;
			}
			else
				div++;
		}
		bw.flush();
		br.close();
		bw.close();
	}
}