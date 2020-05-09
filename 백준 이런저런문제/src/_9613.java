import java.io.*;
import java.util.StringTokenizer;

public class _9613 {
	//유클리드 호제법 사용

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		
		while(test > 0)
		{
			long res = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			
			for(int i=0; i<n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			for(int i=0; i<n; i++)
				for(int j=i+1; j<n; j++)
					res += GCD(Math.max(arr[i], arr[j]), Math.min(arr[i], arr[j]));
			
			bw.write(res + "\n");
			test--;
		}
		bw.flush();
		br.close();
		bw.close();
	}
	
	static int GCD(int x, int y)
	{
		if(y == 0)
			return x;
		else
			return GCD(y, x%y);
	}
}