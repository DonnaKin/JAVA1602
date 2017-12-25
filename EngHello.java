public class  EngHello extends Greeting
{
		public String name="Mr.Hong";

		public void sayHello(){
			System.out.println(this.name+" Nice to meet you!!!");
		}
		public void test(){
			System.out.print(super.name);
			super.sayHello();
		}

		public static void main(String args[]){
			EngHello eng = new EngHello();
			eng.sayHello(); // EngHello클래스에 있는 sayHello()호출
			eng.test();
		}
	}