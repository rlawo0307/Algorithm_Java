import java.io.*;

public class _1212 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine();
		StringBuffer res = new StringBuffer();
		//String res = "";
		
		for(int i=0; i<n.length(); i++)
		{
			String tmp = Integer.toBinaryString(Integer.parseInt(String.valueOf(n.charAt(i))));
			
			if(i != 0)
				for(int j=0; j<3-tmp.length(); j++)
					res.append("0");
					//res += "0";
			//res += tmp;
			res.append(tmp);
		}
		
		bw.write(String.valueOf(res));
		bw.flush();
		br.close();
		bw.close();
	}
}