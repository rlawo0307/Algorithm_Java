import java.io.*;

public class _10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		
		while((str = br.readLine()) != null)
		{
			int large = 0, small = 0, num = 0, space = 0;
			
			for(int i=0; i<str.length(); i++)
			{
				char a = str.charAt(i);
				if(a == ' ')
					space++;
				else if('A' <= a && a <= 'Z')
					large++;
				else if('a' <= a && a <= 'z')
					small++;
				else
					num++;
			}
			bw.write(small + " " + large + " " + num + " " + space + "\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}