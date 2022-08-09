package overloading;

public class MethodOverloading {
	
	int a= 10;
	int b=20;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum (int x, int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	void sum (int x, int y, int z) 
	{
		System.out.println(x+y+z);
	}
	
	void sum (int x, double y)
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum();						// First method
		mo.sum(118,239);				// Second Method
		mo.sum(334,454,654);			// Third Method
		mo.sum(44,59.9);				// Fourth Method
		

	}

}
