import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		int up = sc.nextInt();
		int down = sc.nextInt();
		int[] arr = new int[total+1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		int[] dx = {up, down*-1};
		
		q.add(start);
		
		while(!q.isEmpty())
		{
			int cur = q.poll();
			
			if(cur == end)
			{
				System.out.println(arr[end]);
				return ;
			}
			
			for(int i=0; i<2; i++)
			{
				int next = cur + dx[i];
				
				if(next < 1 || next > total)
					continue;
				if(arr[next] != 0)
					continue;
				if(next == start)
					continue;
				
				arr[next] = arr[cur] + 1;
				q.add(next);
			}
		}
		System.out.println("use the stairs");	
	}
}