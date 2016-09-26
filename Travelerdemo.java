
public class Travelerdemo {

	public static void main(String[] args) {
		Traveler Appu=new Traveler(19,20,2000,true);
		Checks Checkpoint1=new Checks();
		
		if(Checkpoint1.CheckBaggage(Appu) && Checkpoint1.CheckImmigration(Appu) && Checkpoint1.CheckSecurity(Appu) )
			System.out.println("Fly");
		else
			System.out.println("Stay back");

	}

}
