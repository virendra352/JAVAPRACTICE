class A{
	void show() {
		//System.out.println();
	}
}
public class innerclass {
public static void main(String[] args) {
	A a=new A() {
		void show() {
			System.out.println("Show method is Running");
		}
		
	};
	a.show();
}
}
