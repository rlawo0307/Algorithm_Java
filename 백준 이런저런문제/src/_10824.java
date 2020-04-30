import java.io.*;
import java.util.StringTokenizer;

public class _10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] input = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<4; i++)
			input[i] = Integer.parseInt(st.nextToken());
		
		long res;
		res = Long.parseLong(String.valueOf(input[0])+String.valueOf(input[1]));
		res += Long.parseLong(String.valueOf(input[2])+String.valueOf(input[3]));
		
		bw.write(res + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}