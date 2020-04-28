import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		for(int i=0; i<n; i++)
			bw.write(list.get(i) + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}