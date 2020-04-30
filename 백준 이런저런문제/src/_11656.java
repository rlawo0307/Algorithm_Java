import java.io.*;
import java.util.Arrays;

public class _11656 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] arr = new String[str.length()];
		
		for(int i=0; i<str.length(); i++)
			arr[i] = str.substring(i);
		
		Arrays.sort(arr);
		
		for(int i=0; i<str.length(); i++)
			bw.write(arr[i] + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}