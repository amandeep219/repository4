
public class Entry {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		Vehicle v1 = new Car();
		Vehicle v2= new Bike();
		start(v1);
		start(v2);
		
		

	}
	public static void start(Vehicle vehicle)
	{
		
		
			try
			{
				Car v = (Car) vehicle; 
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
		}
	}

}
