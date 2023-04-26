package testStaticNonStaticVarAndMethod;

public class TestJavaStatic {
	
	static String hello = "hello";
	String helloMr = "helloMr";

	public static void main(String[] args) {
		System.out.println(hello);
		System.out.println(new TestJavaStatic().helloMr);
		new TestJavaStatic().testMain();
	}
	
	public void testMain() {

		System.out.println(hello);
		System.out.println(helloMr);
		System.out.println(new TestJavaStatic().helloMr);
		System.out.println(TestJavaStatic.hello);
		
	}

}
