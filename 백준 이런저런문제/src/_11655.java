import java.io.*;

public class _11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String res = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char a = str.charAt(i);
			
			if('A' <= a && a <= 'Z')
			{
				a += 13;
				if(a >= 26 + 'A')
					a -= 26;
			}
			else if('a' <= a && a <= 'z')
			{
				a += 13;
				if(a >= 26 + 'a')
					a -= 26;
			}
			res += a;
		}
		bw.write(res);
		bw.flush();
		br.close();
		bw.close();
	}
}