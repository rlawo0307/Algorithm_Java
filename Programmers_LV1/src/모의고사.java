import java.util.ArrayList;

class 모의고사 {
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
		System.out.println(모의고사.solution(arr));
	}
}

/*
stream 		: 람다를 활용할 수 있는 기술 중 하나. 배열 또는 컬렉션 인스턴스에 원하는 필터를 적용하거나 맵핑을 통해 가공된 결과를 얻을 수 있음
stream()	: 스트림 인스턴스 생성
	Arrays.stream() - 배열 스트림 인스턴스 생성
	리스트명.stream() - 컬렉션 타입 스트림 인스턴스 생성
mapToInt()	: 스트림 인스턴스 내 요소들을 하나씩 특정값(int)으로 변환
*/