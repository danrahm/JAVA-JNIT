package inheritance;

class A 
{
	int a;
	int b;
	
	public void display()
	{
		System.out.println(a+b);
	}
	
}

class B extends A
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}






public class Test1 {

	public static void main(String[] args) {

		
		A obja = new A();
		obja.a= 118;
		obja.b=225;
		obja.display();
		
		B objb = new B();
		objb.x=119;
		objb.y=224;
		objb.show();
		
		objb.a=130;
		objb.b=135;
		objb.display();

	}

}
