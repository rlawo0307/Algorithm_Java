import java.io.*;
import java.util.*;

public class _11652 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Long, Integer> map = new HashMap<Long, Integer>();

		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			long input = Long.parseLong(br.readLine());
			if(map.containsKey(input) == false)
				map.put(input, 1);
			else
				map.put(input, map.get(input)+1);
		}
		
		long max_key = 0;
		int max_value = 0;
		for(Map.Entry<Long, Integer> entry : map.entrySet())
		{
			long key = entry.getKey();
			int value = entry.getValue();
			if((value > max_value) || (value == max_value && key < max_key))
			{
				max_value = value;
				max_key = key;
			}
		}
		bw.write(String.valueOf(max_key));	//출력문자스트림으로 출력
		bw.flush();
		br.close();
		bw.close();
	}
}