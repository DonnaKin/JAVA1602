class MyClass extends GrandFather {
	public MyClass(String str){ // str = "ȫ�浿"
		super(str); //����Ŭ������ �Ű�����1���� ���� ������ ȣ��
		//super("ȫ�浿"); �� ����.
		//super()�޼ҵ�� ������ ù��°�� ��ġ	
		System.out.println("MyClass ������");
	}
	public static void main(String[] args) {
		MyClass s= new MyClass("ȫ�浿");
	}
}
 