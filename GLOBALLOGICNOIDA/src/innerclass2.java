

class A1{
	static int a=20;
	 static class B{
		void show() {
			System.out.println("show is running");
			System.out.println(a);
		}
	}
}
public class innerclass2 {
public static void main(String[] args) {
	A1 a=new A1();
	A1.B b=new A1.B();
	b.show();
	
}
}
