class MyClass extends GrandFather {
	public MyClass(String str){ // str = "홍길동"
		super(str); //상위클래스의 매개변수1개를 갖는 생성자 호출
		//super("홍길동"); 와 같다.
		//super()메소드는 문장의 첫번째에 위치	
		System.out.println("MyClass 생성자");
	}
	public static void main(String[] args) {
		MyClass s= new MyClass("홍길동");
	}
}
 