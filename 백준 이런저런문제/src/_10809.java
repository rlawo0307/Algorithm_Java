import java.io.*;

public class _10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i=0; i<26; i++)
			arr[i] = -1;
		
		for(int i=0; i<str.length(); i++)
			if(arr[str.charAt(i) - 'a'] == -1)
				arr[str.charAt(i) - 'a'] = i;
		
		for(int i=0; i<26; i++)
			bw.write(arr[i] + " ");
		bw.flush();
		br.close();
		bw.close();
	}
}