class vararg{
	void run(int... n) {
	for (int i: n) {
		System.out.println(i);
	}	
	}
}
public class varargs {
public static void main(String[] args) {
	vararg a=new vararg();
	a.run(1,2,3,4,5);
}
}
