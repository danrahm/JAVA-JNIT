package static1;

public class StaticExample1 {
	
	
	int a;
	static int b;
	
	static void m1()
	{
		System.out.println("this is m1");
	}
	void m2()
	{
		System.out.println("this is m2");
	}
	
	
	public static void main(String[] args) {

		
		b=100;
		System.out.println (b);
		m1();
		
		StaticExample1 se= new StaticExample1();
		se.a= 33;
		System.out.println(se.a);
		se.m2();
		
		

	}

}
