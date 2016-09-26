
public class Checks {
	boolean CheckBaggage(Traveler Appu){
		if(Appu.getBaggageAmount()>=0 && Appu.getBaggageAmount()<=40){
			return true;
		}
		else
			return false;
	}
		
		boolean CheckImmigration(Traveler Appu){
			if(Appu.ExpiryYear>=2001 && Appu.ExpiryYear<=2025){
				return true;
			}
			else
				return false;
		}
		
		boolean CheckSecurity(Traveler Appu){
			if(Appu.NOCStatus==true ){
				return true;
			}
			else
				return false;
		}
		
		}
		
			
		
		
	


