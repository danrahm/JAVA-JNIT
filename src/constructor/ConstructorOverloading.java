package constructor;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	
	
	ConstructorOverloading()
	{
		a=33;
		b=44;
		c=55.5;
		
	}
	
	ConstructorOverloading(int x, int y)
	{
		a=x;
		b=y;
	}
	
	ConstructorOverloading(int x, double y)
	{
		a=x;
		c=y;
	}
	
	ConstructorOverloading(int x, int y, double z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorOverloading co = new ConstructorOverloading(11,99,69.9);
		co.display();
		
	}

}
