package evaluation1;

public class cardetails {

	{
		

		cardetails d= new cardetails();
		d.car("Harrier", "Tata", "black");
		d.Engine(10000, 110, "tata", true);
	
		
	}
	public void  car(String model,String companyName,String Color)
	{
		System.out.println("Car Model  :"+model);
		System.out.println("Car companyName  :"+companyName);
		System.out.println("Car Model  Color:"+Color);
		
	}
	public void Engine(int rmp,int Power,String manufacturer,Boolean Turbo) {
		System.out.println("Car RPM  :"+rmp);
		System.out.println("Car Power  :"+Power);
		System.out.println("Car Model  :"+manufacturer);
		System.out.println("Car Engine Manufacture  :"+Turbo);
		
	}

}
