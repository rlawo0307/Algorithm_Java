import java.io.*;

public class _10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int[] res = new int[26];
		
		for(int i=0; i<str.length(); i++)
			res[str.charAt(i) - 'a']++;
		
		for(int i=0; i<26; i++)
			bw.write(res[i] + " ");
		bw.flush();
		br.close();
		bw.close();
	}
}