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

class HotelFactory
{
	Hotel getOrder(String orderName)
	{
		if (orderName.equals("Biryani"))
			return new Biryani();
		else if (orderName.equals("Momos"))
			return new Momos();
		else
			return null;
	}
}

public class FactoryMethodHotel {

	public static void main(String[] args) {
		
		HotelFactory cf= new HotelFactory();
		Hotel x= cf.getOrder("Biryani");
		x.order();
		x.price();x.quantity();
		

	}

}
