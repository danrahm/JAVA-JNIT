package jdbc;
class MySql {
	static 
	{
		System.out.println("MySql Static Block");
	}
	
	MySql() {
		System.out.println("MySql Constructor");
	}
	
}


public class Jdbc1 {
	
	public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Static Method");
		Class x=Class.forName("jdbc.MySql");
		x.newInstance();
	}

}
