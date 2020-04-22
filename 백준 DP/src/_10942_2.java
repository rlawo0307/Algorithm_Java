import java.io.*;
import java.util.StringTokenizer;

public class _10942_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[] index = new int[2];
		int test = Integer.parseInt(br.readLine());
		while(test > 0)
		{
			boolean flag = true;
			st = new StringTokenizer(br.readLine(), " ");
			index[0] = Integer.parseInt(st.nextToken());
			index[1] = Integer.parseInt(st.nextToken());
			

			int mid = (int)(index[0] + index[1])/2;
			
			for(int i=0; i<=mid-index[0]; i++)
				if(arr[index[0]+i] != arr[index[1]-i])
				{
					flag = false;
					break;
				}
			
			if(flag)
				bw.write(1 + "\n");
			else
				bw.write(0 + "\n");
			test--;
		}
		bw.close();
	}
}