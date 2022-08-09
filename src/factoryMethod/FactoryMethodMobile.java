package factoryMethod;


abstract class Mobile 
{
	public abstract int getPrice ();
	
	public String toString()
	{
		return "Price: " + this.getPrice();
	}
	
}

class Apple extends Mobile
{ 	int price;
	Apple (int price)
	{
		this.price = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
}

class Samsung extends Mobile
{
	int price;
	
	Samsung (int price)
	{
		this.price = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
}

class MobileFactory
{
	public static Mobile getInstance( String  Mobile, int price)
	{
		if (Mobile == "apple") 
		{
			return new Apple(price);
		}
		else if (Mobile == "samsung")
		{
			return new Samsung(price);
		}
		return null;
	}
}

public class FactoryMethodMobile {

	public static void main(String[] args) {
		
		Mobile apple = MobileFactory.getInstance("apple", 110000);
		System.out.println(apple + " Apple ");
		
		Mobile samsung = MobileFactory.getInstance("samsung",100000);
		System.out.println(samsung + " Samsung ");

	}

}
