import java.util.ArrayList;

class ���ǰ�� {
    public static int[] solution(int[] answers) {
    	int[][] stu = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
    	int[] correct = new int[3];
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for(int i=0; i<answers.length; i++)
    		for(int j=0; j<3; j++)
    			if(stu[j][i%stu[j].length] == answers[i]) correct[j]++;
    	
    	int tmp = Math.max(correct[0], Math.max(correct[1], correct[2]));
    	for(int i=0; i<3; i++)
    		if(correct[i] == tmp)
    			list.add(i+1);
    	return list.stream().mapToInt(i->i.intValue()).toArray();
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,4};
		System.out.println(���ǰ��.solution(arr));
	}
}

/*
stream 		: ���ٸ� Ȱ���� �� �ִ� ��� �� �ϳ�. �迭 �Ǵ� �÷��� �ν��Ͻ��� ���ϴ� ���͸� �����ϰų� ������ ���� ������ ����� ���� �� ����
stream()	: ��Ʈ�� �ν��Ͻ� ����
	Arrays.stream() - �迭 ��Ʈ�� �ν��Ͻ� ����
	����Ʈ��.stream() - �÷��� Ÿ�� ��Ʈ�� �ν��Ͻ� ����
mapToInt()	: ��Ʈ�� �ν��Ͻ� �� ��ҵ��� �ϳ��� Ư����(int)���� ��ȯ
*/