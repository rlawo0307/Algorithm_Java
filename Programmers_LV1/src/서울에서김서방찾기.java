class ���￡���輭��ã�� {
  public static String solution(String[] seoul) {
	  for(int i=0; i<seoul.length; i++)
	  {
		  if(seoul[i].compareTo("Kim") == 0)
			  return "�輭���� "+i+"�� �ִ�";
	  }
	  return "";
  }
  
  public static void main(String[] args) {
	  String[] arr = {"Jane", "Kim"};
		System.out.println(���￡���輭��ã��.solution(arr));
	}
}