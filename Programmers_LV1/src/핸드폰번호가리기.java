class �ڵ�����ȣ������ {
  public static String �ڵ�����ȣ������(String phone_number) {
	  StringBuilder str = new StringBuilder(phone_number);
	  for(int i=0; i<phone_number.length()-4; i++)
	  {
		  str.setCharAt(i, '*');
	  }
      return str.toString();
  }
  
	public static void main(String[] args) {
		System.out.println(�ڵ�����ȣ������.�ڵ�����ȣ������("0277778888"));
	}
}

/*
toCharArray()		: ���ڿ��� ���ڹ迭�� ��ȯ�ϱ�
String.valueOf()	: ���ڿ��� ��ȯ�ϱ�
StringBuilder	Ŭ����
	- setCharAt()	: i��° �ε����� ���ڸ� Ư�������� ġȯ
	- toString()	: StringBuilder ��ü�� String ��ü�� ��ȯ
*/