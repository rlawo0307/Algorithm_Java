import java.io.*;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;

public class _10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//LinkedList<Integer> list = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			//list.add(Integer.parseInt(br.readLine()));
			arr[i] = Integer.parseInt(br.readLine());
		
		//Collections.sort(list);
		Arrays.sort(arr);
		
		//for(int i : list)
		for(int i : arr)
			bw.write(i + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}