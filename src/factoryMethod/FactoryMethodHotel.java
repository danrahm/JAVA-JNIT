package factoryMethod;

abstract class Hotel
{
	abstract void price ();
	abstract void quantity();
	void order()
	{
		System.out.println("Give order");
	}
	
}

class Biryani extends Hotel
{
	void price()
	{
		System.out.println("Biryani costs 250 rupees");
	}
	void quantity()
	{
		System.out.println("Enough for 2 members");
	}
}

class Momos extends Hotel
{
	void price()
	{
		System.out.println("Momos cost 180 rupees");
	}

	@Override
	void quantity()
	{
		System.out.println("enough of 3 members");
		
	}
}

public class FactoryMethodHotel {

	public static void main(String[] args) {
		
		Hotel x= new Biryani();
		x.order();
		x.price();
		x.quantity();
		
		x= new Momos();
		x.order();
		x.price();
		x.quantity();
		

	}

}
